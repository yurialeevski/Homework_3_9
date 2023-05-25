package ru.skypro.homework.employeeservice.service;

import ru.skypro.homework.employeeservice.employeeDB.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    int getSumEmployeeSalary();
    int getMinEmployeeSalary();
    int getMaxEmployeeSalary();
    List<Employee> getHighSalaryEmployees();
}
