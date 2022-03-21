package com.hashedin.empdaodemo.service;

import com.hashedin.empdaodemo.entity.Employee;
import com.hashedin.empdaodemo.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EmpServiceImpl implements IEmpService {

    @Autowired
    EmpRepo empRepo;

    @Override
    public Employee saveEmployee(Employee employee) {
        empRepo.save(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee targetEmp) {
        Employee employee =empRepo.findById(targetEmp.getEmpId()).get();
        employee.setEmpName(targetEmp.getEmpName());
        employee.setEmpBand(targetEmp.getEmpBand());
        employee.setEmail(targetEmp.getEmail());
        employee.setDesignation(targetEmp.getDesignation());
        employee.setPhNo(targetEmp.getPhNo());
        empRepo.save(employee);
        return targetEmp;
    }

    @Override
    public Employee deleteEmp(Employee targetEmp) {
        empRepo.deleteById(targetEmp.getEmpId());
        return targetEmp;
    }

    @Override
    public List<Employee> getEmpList() {
        return (List<Employee>)empRepo.findAll();
    }

    @Override
    public Employee findEmpById(int empId) {
        return empRepo.findById(empId).get();
    }

}
