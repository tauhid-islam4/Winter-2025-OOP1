package org.dc.exception;



// Main Class
public class InventoryTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        try {
            inventory.addItem("Laptop", 10);
            inventory.removeItem("Laptop", 7);
            //inventory.removeItem("Laptop", 10); // Will trigger OutOfStockException
            inventory.removeItem("HeadSet", 10);
        } catch (OutOfStockException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            inventory.addItem("", 5); // Will trigger InvalidItemException
        } catch (InvalidItemException e) {
            System.out.println("Runtime Exception: " + e.getMessage());
        }

        // Trigger a system failure
        try {
            inventory.triggerSystemFailure();
        } catch (InventorySystemError e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

