const express = require('express');
const app = express();

app.get('/data', (req, res) => {
  console.log('🕒 Service B nhận request, đang xử lý...');
  setTimeout(() => {
    res.send('✅ Response from Service B (after delay)');
  }, 5000); // Delay 5 giây → để test Time Limiter
});

app.listen(4000, () => {
  console.log('✅ Service B running on http://localhost:4000');
});
