const express = require('express');
const axios = require('axios');
const CircuitBreaker = require('opossum');

const app = express();

// Hàm gọi Service B
const callServiceB = async () => {
  return await axios.get('http://localhost:4000/data');
};

// Cấu hình Circuit Breaker
const breaker = new CircuitBreaker(callServiceB, {
//   timeout: 2000,
  errorThresholdPercentage: 20,   // 100% lỗi thì mới mở CB
  volumeThreshold: 6,              // Cần 6 request mới bắt đầu xét lỗi
  resetTimeout: 5000,             // Sau 10s sẽ thử mở lại (half-open)
  rollingCountTimeout: 10000,
  rollingCountBuckets: 1
});

// Log trạng thái của Circuit Breaker
breaker.on('open', () => console.log('🔴 Circuit is OPEN — Tạm dừng gửi request tới Service B'));
breaker.on('halfOpen', () => console.log('🟡 Circuit is HALF-OPEN — Thử lại kết nối Service B'));
breaker.on('close', () => console.log('🟢 Circuit is CLOSED — Service B đã hoạt động lại'));

// Xử lý route gọi qua CB
app.get('/cb', async (req, res) => {
  console.log('\n📥 [REQUEST] /cb');
  console.log('⚙️ Breaker State:', breaker.opened ? 'OPEN' : 'CLOSED or HALF-OPEN');
//   console.log('📊 Stats:', breaker.status.stats);

  try {
    const result = await breaker.fire();
    res.send(result.data);
  } catch (err) {
    if (breaker.opened) {
      return res.status(503).send('⛔ Circuit Breaker is OPEN. Please wait.');
    }
    res.status(503).send('❌ Service B is down, please try again later.');
  }
});

// Khởi chạy Service A
app.listen(3000, () => {
  console.log('✅ Service A running on http://localhost:3000');
});
