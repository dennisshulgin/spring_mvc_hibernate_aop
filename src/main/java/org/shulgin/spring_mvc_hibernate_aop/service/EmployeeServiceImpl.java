package org.shulgin.spring_mvc_hibernate_aop.service;

import org.shulgin.spring_mvc_hibernate_aop.dao.EmployeeDAO;
import org.shulgin.spring_mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }
}
