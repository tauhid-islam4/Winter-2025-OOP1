package org.dc.exception;

// Custom Checked Exception
class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}