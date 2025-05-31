package com.product.services;

import com.product.model.Employee;
import com.product.repository.EmployeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EmployeeServices {

    private final EmployeRepository employeeRepository;

    public EmployeeServices(EmployeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAll(){
        return employeeRepository.findAll();
    }

    public String deleteById(int id)
    {
        employeeRepository.deleteById(String.valueOf(id));
        return "Emp Data Deleted "+ " "+id;
    }

}



