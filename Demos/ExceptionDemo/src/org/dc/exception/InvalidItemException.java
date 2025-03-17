package org.dc.exception;

// Custom Unchecked Exception
class InvalidItemException extends RuntimeException {
    public InvalidItemException(String message) {
        super(message);
    }
}
