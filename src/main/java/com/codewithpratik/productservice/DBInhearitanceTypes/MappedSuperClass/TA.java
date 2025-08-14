package com.codewithpratik.productservice.DBInhearitanceTypes.MappedSuperClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class TA extends User{
    private Long noOfQueries;
    private Date joinDate;
}
