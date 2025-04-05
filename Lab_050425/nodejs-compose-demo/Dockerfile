# Dùng image node chính thức
FROM node:18

# Tạo thư mục app bên trong container
WORKDIR /usr/src/app

# Copy file package và cài dependencies
COPY package.json ./
RUN npm install

# Copy phần còn lại
COPY . .

# Mở port 3000
EXPOSE 3000

# Lệnh chạy app
CMD ["npm", "start"]
