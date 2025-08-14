package com.codewithpratik.productservice.Dtos;

import com.codewithpratik.productservice.models.BaseModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreProductDto extends BaseModel {
    private String title;
    private float price;
    private String description;
    private String category;
    private String image;
}
