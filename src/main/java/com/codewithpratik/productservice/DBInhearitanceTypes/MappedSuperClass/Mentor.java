package com.codewithpratik.productservice.DBInhearitanceTypes.MappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Mentor extends User{
    private String companyName;
}
