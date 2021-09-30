package com.oleg.bryl.managementspringboot.service;

import com.oleg.bryl.managementspringboot.dao.EmployeeRepository;
import com.oleg.bryl.managementspringboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    /**
     *
     * @param theEmployeeRepository
     */
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository) {
        employeeRepository = theEmployeeRepository;
    }
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByLastNameAsc();
    }
    /**
     *
     * @param theId
     * @return
     */
    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);
        Employee theEmployee = null;
        if (result.isPresent()) {
            theEmployee = result.get();
        } else {
            throw new RuntimeException("Did not find employee id: " + theId);
        }
        return theEmployee;
    }
    /**
     *
     * @param theEmployee
     */
    @Override
    public void save(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }
    /**
     *
     * @param theId
     */
    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);

    }
}
