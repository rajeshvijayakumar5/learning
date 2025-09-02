/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rk.core;

import java.text.DecimalFormat;

/**
 *
 * @author rajes
 */
public class Employee {

    private int id;
    private String companyName;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Employee{"
                + "id=" + id
                + ", companyName='" + companyName + '\''
                + ", age=" + age
                + ", salary=" + new DecimalFormat("#.00").format(salary)
                + '}';
    }

    public Employee(int id, String name, int age, double saiary) {
        this.id = id;
        this.companyName = name;
        this.age = age;
        this.salary = saiary;
    }

    public int getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
