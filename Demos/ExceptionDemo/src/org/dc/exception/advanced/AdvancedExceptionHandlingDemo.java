package org.dc.exception.advanced;

public class AdvancedExceptionHandlingDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345678", 500);

        try {
            account.deposit(200);
            account.withdraw(800);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidTransactionException e) {
            System.out.println("Transaction error: " + e.getMessage());
        } finally {
            account.showBalance();
        }

        // Demonstrating Try-With-Resources
        try (AutoCloseableResource resource = new AutoCloseableResource()) {
            resource.performAction();
        } catch (Exception e) {
            System.out.println("Exception while handling resource: " + e.getMessage());
        }

        // Demonstrating Method Overriding with Exception Handling
        PremiumBankAccount premiumAccount = new PremiumBankAccount("98765432", 1000);
        try {
            premiumAccount.withdraw(1500);
        } catch (InsufficientBalanceException | InvalidTransactionException e) {
            System.out.println("Premium Account Error: " + e.getMessage());
        }
    }
}

