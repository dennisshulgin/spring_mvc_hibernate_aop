package org.shulgin.spring_mvc_hibernate_aop.dao;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.shulgin.spring_mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Employee", Employee.class)
                .getResultList();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        sessionFactory.getCurrentSession()
                .save(employee);
    }
}