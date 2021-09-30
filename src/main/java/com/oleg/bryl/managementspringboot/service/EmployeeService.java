package com.oleg.bryl.managementspringboot.service;
import com.oleg.bryl.managementspringboot.entity.Employee;
import java.util.List;

public interface EmployeeService {
    /**
     *
     * @return
     */
    List<Employee> findAll();
    /**
     *
     * @param theId
     * @return
     */
    Employee findById(int theId);
    /**
     *
     * @param theEmployee
     */
    void save(Employee theEmployee);
    /**
     *
     * @param theId
     */
    void deleteById(int theId);
}
