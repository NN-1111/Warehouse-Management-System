# Warehouse Management System

A Java Swing desktop application developed as a college practical project.

## About the Project

This project provides a graphical interface for basic warehouse and product management activities.

## Features

- Login
- Dashboard
- Add Product
- View Product
- Update Product
- Delete Product
- Change Password

## Technologies Used

- Java
- Java Swing
- Java AWT
- MySQL
- MySQL Connector/J
- IntelliJ IDEA

## Database

The `Warehouse_Database.sql` file creates the `warehouse_db` database with two tables:

- `products`
- `users`

Import the SQL file using MySQL Workbench.

## Demo Login

- Username: `naman`
- Password: `1234`

## Implementation Note

The Java application currently uses demo login credentials. Product and password screens are not yet connected to database operations. The SQL script is provided separately.

## How to Run

1. Open the project in IntelliJ IDEA.
2. Configure Java.
3. Add MySQL Connector/J if required.
4. Run `Login.java`.

## Project Structure

- `src/com/warehouse/` - Java source files
- `src/images/` - Project images
- `lib/` - Required library
- `Warehouse_Database.sql` - Database script
- `README.md` - Project documentation
