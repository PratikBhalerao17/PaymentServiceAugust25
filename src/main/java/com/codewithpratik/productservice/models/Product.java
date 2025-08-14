package com.codewithpratik.productservice.models;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class Product extends BaseModel{
    private String title;
    private float price;
    private String description;
    private Category category;
    private String image;
}
