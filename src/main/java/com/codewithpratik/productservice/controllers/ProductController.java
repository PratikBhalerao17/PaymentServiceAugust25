package com.codewithpratik.productservice.controllers;

import com.codewithpratik.productservice.exceptions.ProductNotFoundException;
import com.codewithpratik.productservice.models.Product;
import com.codewithpratik.productservice.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products/")
public class ProductController {
    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Long productId) throws ProductNotFoundException {
//        try {
//            return new ResponseEntity<>(productService.getProductById(productId),
//                    HttpStatus.OK
//                    );
//        }
//        catch(ProductNotFoundException e){
//            return new ResponseEntity<>(
//                    HttpStatus.BAD_REQUEST
//            );
//        }
        return new ResponseEntity<>(productService.getProductById(productId),
                HttpStatus.OK
        );
    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
}
