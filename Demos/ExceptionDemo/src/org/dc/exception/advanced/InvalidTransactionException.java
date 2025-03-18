package org.dc.exception.advanced;

// Custom exception for invalid transactions
class InvalidTransactionException extends Exception {
    public InvalidTransactionException(String message) {
        super(message);
    }
}
