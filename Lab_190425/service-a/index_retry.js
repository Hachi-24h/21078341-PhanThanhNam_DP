const express = require('express');
const axios = require('axios');

const app = express();

// Hàm gọi Service B kèm retry thủ công
const callWithRetry = async (maxRetries = 5, delay = 2000) => {
  let attempt = 0;

  while (attempt < maxRetries) {
    try {
      console.log(`📡 Attempt ${attempt + 1} to call Service B...`);
      const res = await axios.get('http://localhost:4000/data');
      return res.data;
    } catch (err) {
      console.log(`❌ Failed attempt ${attempt + 1}:`, err.message);
      attempt++;
      if (attempt < maxRetries) {
        console.log(`⏳ Retrying in ${delay / 1000}s...\n`);
        await new Promise(resolve => setTimeout(resolve, delay));
      } else {
        throw new Error('Khong thể kết nối tới Service B sau nhiều lần thử. Vui lòng thử lại sau!');
      }
    }
  }
};

app.get('/retry', async (req, res) => {
  try {
    const result = await callWithRetry(5, 2000); // Retry 5 lần, mỗi lần cách 2s
    res.send(result);
  } catch (err) {
    res.status(503).send(err.message);
  }
});

app.listen(3000, () => {
  console.log('✅ Service A with Retry Pattern running on http://localhost:3000');
});
