package com.oleg.bryl.managementspringboot.dao;

import com.oleg.bryl.managementspringboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    /**
     * @return
     */
    List<Employee> findAllByOrderByLastNameAsc();
}
