package com.codewithpratik.productservice.DBInhearitanceTypes.SingleTable;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "st_mentor")
//@DiscriminatorValue("MENTOR")
public class Mentor extends User {
    private String companyName;
}
