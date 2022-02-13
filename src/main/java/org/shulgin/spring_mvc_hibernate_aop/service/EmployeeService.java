package org.shulgin.spring_mvc_hibernate_aop.service;

import org.shulgin.spring_mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);
}
