package com.hashedin.empdaodemo.service;


import com.hashedin.empdaodemo.entity.Employee;

import java.util.List;

public interface IEmpService {
    public Employee saveEmployee(Employee emp);

    public Employee updateEmployee(Employee emp);

    public Employee deleteEmp(Employee emp);

    public List<Employee> getEmpList();

    public Employee  findEmpById(int empId);
}
