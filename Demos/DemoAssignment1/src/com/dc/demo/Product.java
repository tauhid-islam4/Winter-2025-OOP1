package com.dc.demo;

import java.util.Date;

public class Product {
    private int productId;
    private String productName;
    private double productPrice;
    private Date productDate;
    private Date expiryDate;
    private int productQuantity;

    public static String MANUFACTURER_NAME = "BMW";

    //Default constructor
    public Product() { }

    //Constructor that takes all the attributes
    public Product(int productId, String productName, double productPrice, Date productDate, Date expiryDate, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDate = productDate;
        this.expiryDate = expiryDate;
        this.productQuantity = productQuantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public void printProductDescription() {
        System.out.println("Product ID: " + this.productId);
        System.out.println("Product Name: " + this.productName);
        System.out.println("Product Price: " + this.productPrice);
        System.out.println("Product Date: " + this.productDate);
        System.out.println("Product Expiry Date: " + this.expiryDate);
        System.out.println("Product Quantity: " + this.productQuantity);
    }


}
