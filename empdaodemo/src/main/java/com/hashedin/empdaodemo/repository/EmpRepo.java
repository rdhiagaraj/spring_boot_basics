package com.hashedin.empdaodemo.repository;

import com.hashedin.empdaodemo.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends CrudRepository<Employee, Integer> {
}
