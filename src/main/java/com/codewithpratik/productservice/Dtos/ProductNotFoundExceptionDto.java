package com.codewithpratik.productservice.Dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundExceptionDto {
    private String message;
    private String resolution;
    public ProductNotFoundExceptionDto(String Message, String resolution) {
        this.message = Message;
        this.resolution = resolution;
    }
}
