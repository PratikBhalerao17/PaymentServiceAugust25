package com.codewithpratik.productservice.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class Category extends BaseModel{
    private String categoryName;
}
