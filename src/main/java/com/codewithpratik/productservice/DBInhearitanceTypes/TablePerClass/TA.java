package com.codewithpratik.productservice.DBInhearitanceTypes.TablePerClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity(name = "tbc_ta")
public class TA extends User {
    private Long noOfQueries;
    private Date joinDate;
}
