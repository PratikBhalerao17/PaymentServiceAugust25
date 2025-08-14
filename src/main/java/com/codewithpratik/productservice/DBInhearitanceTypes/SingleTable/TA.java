package com.codewithpratik.productservice.DBInhearitanceTypes.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
//@DiscriminatorValue("TA")
@Entity(name = "st_ta")
public class TA extends User {
    private Long noOfQueries;
    private Date joinDate;
}
