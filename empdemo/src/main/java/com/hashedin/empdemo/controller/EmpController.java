package com.hashedin.empdemo.controller;

import com.hashedin.empdemo.model.Employee;
import com.hashedin.empdemo.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
public class EmpController {

    @Autowired
    private IEmpService empService;

    @PostMapping("/saveEmp")
    public ResponseEntity<Employee> saveEmp(@RequestBody Employee emp) {
        System.out.println("EmpController.saveEmp() mtd");
    return new ResponseEntity(empService.saveEmployee(emp), HttpStatus.CREATED);
    }

    @PutMapping("/updateEmp")
    public ResponseEntity<Employee> updateEmp(@RequestBody Employee emp) {
        System.out.println("EmpController.updateEmp() mtd");
        return new ResponseEntity(empService.updateEmployee(emp), HttpStatus.OK);
    }

    @DeleteMapping("/deleteEmp")
    public ResponseEntity<Employee> deleteEmp(@RequestBody Employee emp) {
        System.out.println("EmpController.deleteEmp() mtd");
        return new ResponseEntity(empService.deleteEmp(emp), HttpStatus.OK);
    }

    @GetMapping("/getEmpList")
    public ResponseEntity<List<Employee>> getEmpList() {
        System.out.println("EmpController.getEmpList() mtd");
        return new ResponseEntity(empService.getEmpList(), HttpStatus.OK);
    }

    @GetMapping("/findEmpById/{id}")
    public ResponseEntity<Employee> findEmpById(@PathVariable(value = "id") int id) {
        System.out.println("EmpController.findEmpById() mtd");
        return new ResponseEntity(empService.findEmpById(id), HttpStatus.OK);
    }

}
