package com.hashedin.empdemo.service;

import com.hashedin.empdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class EmpServiceImpl implements IEmpService {

    List<Employee> employeeList = new ArrayList<Employee>();

    @Override
    public Employee saveEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("########################################" +employeeList.toString());
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee targetEmp) {
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpId()==targetEmp.getEmpId()) {
                employee.setEmpName(targetEmp.getEmpName());
                employee.setEmpBand(targetEmp.getEmpBand());
                employee.setEmail(targetEmp.getEmail());
                employee.setDesignation(targetEmp.getDesignation());
                employee.setPhNo(targetEmp.getPhNo());
            }
        }
        System.out.println("########################################" +employeeList.toString());
        return targetEmp;
    }

    @Override
    public Employee deleteEmp(Employee targetEmp) {
        Iterator<Employee> iterator = employeeList.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpId() == targetEmp.getEmpId()) {
                System.out.println("inside loop");
                employeeList.remove(employee);
                break;
            }
        }
        System.out.println("########################################" +employeeList.toString());
        return targetEmp;
    }

    @Override
    public List<Employee> getEmpList() {
        return employeeList;
    }

    @Override
    public Employee findEmpById(int empId) {
        Iterator<Employee> iterator = employeeList.iterator();
        Employee targetEmp=null;
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getEmpId() == empId) {
                System.out.println("inside loop");
                targetEmp=employee;
                break;
            }
        }
        return targetEmp;
    }

}
