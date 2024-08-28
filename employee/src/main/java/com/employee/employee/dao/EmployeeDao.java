package com.employee.employee.dao;

import com.employee.employee.employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<employee, Integer> {
    //static List<Employee> findAll();
}
