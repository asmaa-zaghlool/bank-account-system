# Bank Account System 💳

A simple banking system built using Java and Spring Boot that simulates basic bank account operations such as creating an account, depositing money, withdrawing money, and tracking transactions.

---

## 📌 Project Overview

This project allows users to create a bank account by providing:

- Account name
- Password
- Initial balance

The system then provides several banking operations through REST APIs.

---

## ✨ Features

- Create a new bank account
- Deposit money into the account
- Withdraw money from the account
- Check account balance
- Close or activate the account
- Daily withdrawal limit
- Store transaction history
- Save transaction type, amount, and date

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- REST API
- Maven
- OOP Principles

---

## 📂 Project Structure

bash
src
 ┣ entity
 ┃ ┣ Account.java
 ┃ ┗ Transactions.java
 ┣ controller
 ┃ ┗ Controller.java


---

## 🔄 API Endpoints

### Create New Account

http
POST /addNewAccount


### Show Account Information

http
GET /showAccountDetails


### Deposit Money

http
POST /deposit


### Withdraw Money

http
POST /withdrew


### Show Account Balance

http
GET /showAccountBalance


### Show All Deposit Transactions

http
GET /depositTransactions


### Show All Withdrawal Transactions

http
GET /withdrawTransactions


### Activate or Close Account

http
POST /activateOrCloseAccount


---

## 💡 Business Logic

### Withdrawal Rules

- Users cannot withdraw more than their balance.
- The daily withdrawal limit is set to 500.
- Closed accounts cannot perform transactions.

### Transactions

Each transaction stores:

- Transaction ID
- Transaction Type
- Amount
- Transaction Date

---

## 🚀 How to Run the Project

1. Clone the repository

bash
git clone <your-repository-link>


2. Open the project using IntelliJ IDEA or any Java IDE.

3. Run the Spring Boot application.

4. Use Postman to test the APIs.

---

## 📖 What I Learned

Through this project, I practiced:

- Object-Oriented Programming (OOP)
- Building REST APIs with Spring Boot
- Working with Controllers and Entities
- Handling business logic in Java
- Managing transactions and validation logic

---

## 🔮 Future Improvements

- Add database integration using MySQL
- Add authentication and security
- Support multiple bank accounts
- Improve exception handling
- Add transfer between accounts
- Build a frontend interface
