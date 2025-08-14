package com.codewithpratik.productservice.DBInhearitanceTypes.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@DiscriminatorValue("STUDENT")
@Entity(name = "st_student")
public class Student extends User {
    private double psp;
    private String university;
}
