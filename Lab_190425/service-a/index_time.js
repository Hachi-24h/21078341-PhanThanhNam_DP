const express = require('express');
const axios = require('axios');

const app = express();

// ⏱️ Hàm timeout promise
const withTimeout = (promise, ms) => {
  const timeout = new Promise((_, reject) =>
    setTimeout(() => reject(new Error('Request quá thời gian 3s !')), ms)
  );
  return Promise.race([promise, timeout]);
};

// Gọi tới Service B, có giới hạn thời gian
app.get('/time', async (req, res) => {
  try {
    const response = await withTimeout(
      axios.get('http://localhost:4000/data'),
      3000 // ⏱️ Time limit: 3 giây
    );
    res.send(response.data);
  } catch (err) {
    console.error('❌ Error:', err.message);
    res.status(504).send(err.message); // Gateway Timeout
  }
});

app.listen(3000, () => {
  console.log('✅ Service A with Time Limiter running on http://localhost:3000');
});
