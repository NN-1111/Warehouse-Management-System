-- WAREHOUSE MANAGEMENT SYSTEM DATABASE

-- 1. Create Database
CREATE DATABASE IF NOT EXISTS warehouse_db;

-- 2. Select Database
USE warehouse_db;

-- 3. Create Products Table
CREATE TABLE IF NOT EXISTS products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    category VARCHAR(100),
    quantity INT,
    price DOUBLE
);

-- 4. Create Users Table
CREATE TABLE IF NOT EXISTS users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(100) NOT NULL
);

-- 5. Insert Default Login
INSERT IGNORE INTO users (username, password)
VALUES ('naman', '1234');

-- 6. Check Tables
SHOW TABLES;

-- 7. View Products
SELECT * FROM products;

-- 8. View Users
SELECT * FROM users;