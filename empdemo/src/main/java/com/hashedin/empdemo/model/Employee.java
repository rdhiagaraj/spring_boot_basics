package com.hashedin.empdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    int empId;
    String empName;
    String empBand;
    String designation;
    String email;
    String phNo;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empBand='" + empBand + '\'' +
                ", designation='" + designation + '\'' +
                ", email='" + email + '\'' +
                ", phNo='" + phNo + '\'' +
                '}';
    }
}
