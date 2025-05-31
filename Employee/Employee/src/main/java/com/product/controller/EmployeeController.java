package com.product.controller;

import com.product.model.Employee;
import com.product.services.EmployeeServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeServices employeeServices;
    public EmployeeController(EmployeeServices employeeServices){
        this.employeeServices = employeeServices;
    }
    @GetMapping("/employee")
    public List<Employee> findAll()
    {
        return employeeServices.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable int id)
    {
        return employeeServices.deleteById(id);
    }

}
