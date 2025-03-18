package org.dc.exception.advanced;

// Bank Account class demonstrating OOP principles
class BankAccount {
    private String accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Deposit amount must be positive.");
        }
        balance += amount;
        System.out.println("Successfully deposited: $" + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException, InvalidTransactionException {
        if (amount <= 0) {
            throw new InvalidTransactionException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("Successfully withdrew: $" + amount);
    }

    public void showBalance() {
        System.out.println("Current balance: $" + balance);
    }
}
