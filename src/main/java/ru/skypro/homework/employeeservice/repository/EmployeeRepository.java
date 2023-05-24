package ru.skypro.homework.employeeservice.repository;

import ru.skypro.homework.employeeservice.employeeDB.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();
    int getSumSalary();
    int getMinSalary();
    int getMaxSalary();
    List<Employee> getHighSalary();
}
