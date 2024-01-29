# Simple Banking Application

This is a console-based banking application implemented in Java. The application provides basic functionalities such as creating accounts, displaying account information, updating accounts, deleting accounts, depositing and withdrawing amounts, searching for accounts, and exiting the application.

## Project Structure

The project is organized into three classes:

1. **Account.java**: Defines the `Account` class, encapsulating the properties of an account. It includes methods for retrieving and updating the account number and balance.

2. **Bank.java**: Defines the `Bank` class that manages a collection of accounts. It includes methods for creating accounts, displaying all accounts, updating and deleting accounts, depositing and withdrawing amounts, and searching for accounts.

3. **BankingApplication.java**: Contains the main method that serves as the entry point for the console application. Users can interact with the application through a menu system.

## How to Run

1. Open a terminal or command prompt in the project directory.

2. Compile the Java files:

   ```bash
   javac BankingApplication.java

3. Run the main class


   ```bash
    java BankingApplication


## Usage

1. Create a new account: Enter the required details to create a new account.

2. Display all accounts: View information about all existing accounts.

3. Update an account: Modify the balance of an existing account.

4. Delete an account: Remove an account from the system.

5. Deposit an amount: Add funds to an existing account.

6. Withdraw an amount: Deduct funds from an existing account, considering the minimum balance.

7. Search for an account: Find and display details of a specific account.

8. Exit: Terminate the application.