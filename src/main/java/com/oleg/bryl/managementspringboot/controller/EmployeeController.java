package com.oleg.bryl.managementspringboot.controller;

import com.oleg.bryl.managementspringboot.entity.Employee;
import com.oleg.bryl.managementspringboot.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    /**
     * @param theEmployeeService
     */
    public EmployeeController(EmployeeService theEmployeeService) {
        employeeService = theEmployeeService;

    }
    /**
     * @param theModel
     * @return
     */
    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {
        Employee theEmployee = new Employee();
        theModel.addAttribute("employee", theEmployee);
        return "/employees/employee-form";
    }
    /**
     * @param theEmployee
     * @return
     */
    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {

        employeeService.save(theEmployee);

        return "redirect:/employees/list";
    }
    /**
     * @param theModel
     * @return
     */
    @GetMapping("/list")
    public String listEmployees(Model theModel) {
        List<Employee> theEmployees = employeeService.findAll();
        theModel.addAttribute("employees", theEmployees);
        return "/employees/list-employees";
    }
    /**
     * @param theId
     * @param theModel
     * @return
     */
    @GetMapping("/showFormForUpdate")
    public String howFormForUpdate(@RequestParam("employeeId") int theId, Model theModel) {
        Employee theEmployee = employeeService.findById(theId);
        theModel.addAttribute("employee", theEmployee);
        return "/employees/employee-form";
    }
    /**
     * @param theId
     * @return
     */
    @GetMapping("/delete")
    public String delete(@RequestParam("employeeId") int theId) {
        employeeService.deleteById(theId);
        return "redirect:/employees/list";
    }
}