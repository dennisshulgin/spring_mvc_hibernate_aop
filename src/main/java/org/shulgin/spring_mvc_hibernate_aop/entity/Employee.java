package org.shulgin.spring_mvc_hibernate_aop.entity;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;

    @Column(name = "name")
    @Size(min = 2, max = 30, message = "name must be from 2 to 30 symbols")
    @NotBlank(message = "name must be not empty")
    public String name;

    @Column(name = "surname")
    @Size(min = 2, max = 30, message = "surname must be from 2 to 30 symbols")
    @NotBlank(message = "surname must be not empty")
    public String surname;

    @Column(name = "department")
    @NotBlank(message = "department must be not empty")
    public String department;

    @Column(name = "salary")
    @Min(value = 500, message = "salary must be greater than 499")
    @Max(value = 1500, message = "salary must be less than 1501")
    public int salary;

    public Employee() {}

    public Employee(String name, String surname, String department, int salary) {
        this.name = name;
        this.surname = surname;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
