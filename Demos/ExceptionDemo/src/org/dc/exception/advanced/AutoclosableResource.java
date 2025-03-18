package org.dc.exception.advanced;

// Resource class to demonstrate Try-With-Resources
class AutoCloseableResource implements AutoCloseable {
    public AutoCloseableResource() {
        System.out.println("Resource opened.");
    }

    public void performAction() {
        System.out.println("Performing resource operation.");
    }

    @Override
    public void close() {
        System.out.println("Resource closed.");
    }
}
