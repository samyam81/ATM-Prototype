# Bank ATM System

This project implements a basic banking ATM system with graphical user interface (GUI) using Java Swing and database integration with MySQL.

## Features

- **EngDONE**: Displays a message indicating that a transaction has been completed successfully.
- **EngAMT**: Handles the interface for entering the transaction amount and checks for insufficient funds.
- **DBconn**: Manages the database connection and operations such as retrieving and updating account balances.
- **EngENQ**: Displays the account balance retrieved from the database.
- **EngOFO**: Displays a message when there are insufficient funds in the account.
- **EngPAY**: Handles the payment mode interface for entering recipient's account number.
- **EngPIN**: Manages the PIN entry interface for user authentication.
- **EngTRANS**: Presents the transaction options interface for selecting various transaction types.
- **Splash**: Displays a splash screen with a loading message when the application is launched.

## Usage

1. **Database Setup**:
   - Create a MySQL database named `BankATM`.
   - Execute the SQL script provided in `database_setup.sql` to create tables and insert sample data.

2. **Running the Application**:
   - Compile and run the Java classes using any IDE or command-line tools.
   - Ensure the MySQL server is running to establish the database connection.

3. **Interacting with the Application**:
   - Follow the GUI prompts to perform banking transactions such as withdrawal, transfer, payment, or inquiry.

## Requirements

- Java Development Kit (JDK)
- MySQL Server
- Java Swing GUI Library
- JDBC Driver for MySQL

## Contributors

- [Samyam.81](https://github.com/samyam81)

