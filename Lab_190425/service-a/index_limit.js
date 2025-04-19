const express = require('express');
const axios = require('axios');
const rateLimit = require('express-rate-limit');

const app = express();

// Biến lưu request count theo IP (hoặc toàn cục nếu bạn muốn)
let requestCounts = {};

// Tạo middleware custom rate limit
const limiter = rateLimit({
    windowMs: 60 * 1000,     // 1 phút
    max: 10,                 // Tối đa 10 request
    standardHeaders: true,
    legacyHeaders: false,
    message: '⛔ Too many requests, please wait a minute.',
    handler: (req, res, next, options) => {
      const ip = req.ip;
      const count = requestCounts[ip] || 0;
      console.log(`❌ IP ${ip} đã vượt giới hạn: ${count}/10`);
      res.status(429).send(`⛔ Too many requests (${count}/10), please wait a minute.`);
    },
    keyGenerator: (req) => req.ip
  });
// Middleware đếm request thủ công (để log hoặc debug)
app.use((req, res, next) => {
  const ip = req.ip;
  requestCounts[ip] = (requestCounts[ip] || 0) + 1;
  console.log(`📊 Request count from ${ip}: ${requestCounts[ip]}/10`);
  next();
});

// Endpoint bị giới hạn
app.get('/limited', limiter, async (req, res) => {
  try {
    const response = await axios.get('http://localhost:4000/data');
    res.send(`✅ Success! Request ${requestCounts[req.ip]}/10\n` + response.data);
  } catch (err) {
    res.status(503).send('❌ Service B is down.');
  }
});

// Xoá đếm mỗi phút để reset
setInterval(() => {
  requestCounts = {}; // reset toàn bộ IP
}, 60 * 1000);

app.listen(3000, () => {
  console.log('✅ Service A with Rate Limiter running on http://localhost:3000');
});
