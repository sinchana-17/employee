package com.employee.employee.controller;

import com.employee.employee.employee;
import com.employee.employee.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/Employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/AllEmployees")
    public List<employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
}
