package com.codewithpratik.productservice.exceptions;

public class ProductNotFoundException extends Exception {
    Long productId;
    public ProductNotFoundException(Long productId,String message) {
        super(message+ " (Product ID: " + productId + ")");
        this.productId = productId;
    }
}
