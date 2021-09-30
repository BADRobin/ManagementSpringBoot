package com.oleg.bryl.managementspringboot.service;

import com.oleg.bryl.managementspringboot.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int theId);
    void save(Employee theEmployee);
    void deleteById(int theId);
}
