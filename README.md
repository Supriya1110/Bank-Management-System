# Bank Management System

## Overview

The Bank Management System is a simple Java application that simulates basic banking operations such as creating accounts, depositing money, withdrawing money, and displaying account information. This project follows Object-Oriented Design (OOD) principles, ensuring clean code separation and reusability.

## Features

- Create a new bank account
- Deposit money into an account
- Withdraw money from an account
- Display account information
- Menu-driven command-line interface

## Project Structure
The project is organized into multiple classes in the same package (bankSystem):

- **BankAccount**: Manages individual bank accounts (deposit, withdraw, and display balance).
- **Bank**: Handles multiple bank accounts and supports account creation and transaction operations.
- **BankManagementSystem**: Entry point of the program that provides a command-line menu for user interaction.

## Class Breakdown

### 1. `BankAccount.java`
Represents an individual bank account with:

 - Attributes: accountHolderName, accountNumber, balance
 - Methods:
    - deposit(double amount)
    - withdraw(double amount)
    - getBalance()
    - displayAccountInfo()

### 2. `Bank.java`
Handles multiple BankAccount objects and includes methods to:

  1. createAccount(String accountHolderName, String accountNumber, double initialDeposit)
  2. depositToAccount(String accountNumber, double amount)
  3. withdrawFromAccount(String accountNumber, double amount)
  4. displayAccountInfo(String accountNumber)

### 3. `BankManagementSystem.java`
The main class that provides a command-line interface, allowing the user to:

  1. Create an account
  2. Deposit money
  3. Withdraw money
  4. Display account info
  5. Exit

## Project Structure:


	├── src
	│   └── bankSystem
	│       ├── BankAccount.java
	│       ├── Bank.java
	│       └── BankManagementSystem.java
	└── README.md


## Example Interaction:


   ![image](https://github.com/user-attachments/assets/765a930d-8071-4044-8782-f034ca8906c1)


 
## Example Usage


  1. Create Account: Input the account holder's name, account number, and initial deposit.
  
  2. Deposit: Provide the account number and amount to deposit.
  
  3. Withdraw: Provide the account number and amount to withdraw.
  
  4. Display Account Info: Enter the account number to display account details.
  
  5. Exit: Exit the application.


## Future Enhancements

- Add password protection for accounts
- Implement account types (savings, current, etc.)
= Add interest calculation feature
- Build a GUI-based version for a better user experience

## Contributing

Contributions are welcome! Please follow these steps:

- Fork the repository.
- Create your feature branch: git checkout -b feature/YourFeature
- Commit your changes: git commit -m 'Add some feature'
- Push to the branch: git push origin feature/YourFeature
- Open a pull request.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.
