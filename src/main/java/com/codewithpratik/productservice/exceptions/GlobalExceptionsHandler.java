package com.codewithpratik.productservice.exceptions;

import com.codewithpratik.productservice.Dtos.ProductNotFoundExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionsHandler {
    ProductNotFoundExceptionDto productNotFoundExceptionDto = new ProductNotFoundExceptionDto(
            "Product not found",
            "Please enter the valid product ID"
    );


    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<ProductNotFoundExceptionDto> handleProductNotFoundException(ProductNotFoundException ex) {
//            return new ResponseEntity<>(
//                    productNotFoundExceptionDto,
//                    HttpStatus.BAD_REQUEST
//            );
        return new ResponseEntity<>(
                new ProductNotFoundExceptionDto(
                    ex.getMessage(),
                        "Please enter the valid product ID"
                ),
                HttpStatus.BAD_REQUEST
        );
        }
}
