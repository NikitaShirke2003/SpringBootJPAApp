package com.csi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Range;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="EMPLOYEE")
@Entity

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int empId;
    @Size(min=2,message = "Employee Name Should be At Least 2 characters")
    private String empName;
    private String empAddress;

    @Range(min=1000000000,max=9999999999L,message = "Employee COntact Number must be 10 Digit")
    private long empContactNumber;


}
