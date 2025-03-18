package org.dc.exception.advanced;

// Specialized account with method overriding and exception handling
class PremiumBankAccount extends BankAccount {
    public PremiumBankAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException, InvalidTransactionException {
        if (amount > getBalance() + 1000) {
            throw new InsufficientBalanceException("Withdrawal limit exceeded for premium accounts with overdraft protection.");
        }
        setBalance( getBalance() - amount );
        if(getBalance() < 0) {
            System.out.println("Successfully withdrew: $" + amount + " with over-draft protection");
        } else {
            System.out.println( "Successfully withdrew: $" + amount + " without overdraft");
        }

        //super.withdraw(amount);
    }
}
