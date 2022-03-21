package com.hashedin.empdaodemo.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Data
@Table(name ="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int empId;
    String empName;
    String empBand;
    String designation;
    String email;
    String phNo;


}
