package ru.skypro.homework.employeeservice.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.employeeservice.employeeDB.Employee;
import ru.skypro.homework.employeeservice.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }

    @Override
    public int getSumEmployeeSalary() {
        return employeeRepository.getSumSalary();
    }
    @Override
    public int getMinEmployeeSalary() {
        return employeeRepository.getMinSalary();
    }
    @Override
    public int getMaxEmployeeSalary() {
        return employeeRepository.getMaxSalary();
    }
    @Override
    public List<Employee> getHighSalaryEmployees() {
        return employeeRepository.getHighSalary();
    }
}
