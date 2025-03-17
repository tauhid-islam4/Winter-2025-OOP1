package org.dc.exception;

import java.util.HashMap;
import java.util.Map;

// Inventory Class
class Inventory {
    private Map<String, Integer> stock = new HashMap<>();

    // Add items to inventory
    public void addItem(String item, int quantity) {
        if (item == null || item.isEmpty()) {
            throw new InvalidItemException("Item name cannot be null or empty");
        }
        stock.put(item, stock.getOrDefault(item, 0) + quantity);
    }

    // Remove items from inventory
    public void removeItem(String item, int quantity) throws OutOfStockException {
        if (!stock.containsKey(item)) {
            throw new OutOfStockException("Item " + item + " is not in stock");
        }
        int currentStock = stock.get(item);
        if (currentStock < quantity) {
            throw new OutOfStockException("Not enough stock for " + item);
        }
        stock.put(item, currentStock - quantity);
    }

    // Simulate a critical system failure
    public void triggerSystemFailure() {
        throw new InventorySystemError("Critical system failure detected!");
    }
}

