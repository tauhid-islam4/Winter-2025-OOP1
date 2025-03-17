package org.dc.exception;

// Custom Error
class InventorySystemError extends Error {
    public InventorySystemError(String message) {
        super(message);
    }
}