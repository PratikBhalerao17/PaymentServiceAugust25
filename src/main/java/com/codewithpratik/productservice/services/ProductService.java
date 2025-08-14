package com.codewithpratik.productservice.services;

import com.codewithpratik.productservice.exceptions.ProductNotFoundException;
import com.codewithpratik.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long productId) throws ProductNotFoundException;
    List<Product> getAllProducts();

    Product saveProduct(Product product);
    Product updateProduct(Product product);
    void deleteProduct(Long productId);

}
