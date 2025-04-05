const express = require('express');
const mysql = require('mysql2');

const app = express();
const PORT = 3000;

const dbConfig = {
  host: 'mysql',
  user: 'user',
  password: 'password',
  database: 'mydb'
};

function connectWithRetry() {
  const connection = mysql.createConnection(dbConfig);
  connection.connect(err => {
    if (err) {
      console.error('❌ Failed to connect to MySQL. Retrying in 3s...');
      setTimeout(connectWithRetry, 3000); // Thử lại sau 3 giây
    } else {
      console.log('✅ Connected to MySQL!');
      app.get('/', (req, res) => {
        connection.query('SELECT NOW() AS time', (err, result) => {
          if (err) return res.status(500).json({ error: err });
          res.json({ message: 'MySQL Connected!', time: result[0].time });
        });
      });
    }
  });
}

connectWithRetry();

app.listen(PORT, () => {
  console.log(`🚀 Server running at http://localhost:${PORT}`);
});
