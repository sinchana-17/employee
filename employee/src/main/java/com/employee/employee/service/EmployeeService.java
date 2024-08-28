package com.employee.employee.service;

import com.employee.employee.dao.EmployeeDao;
import com.employee.employee.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    @Autowired
    EmployeeDao employeeDao;

    public List<employee> getAllEmployee() {
        return employeeDao.findAll();
    }
}
