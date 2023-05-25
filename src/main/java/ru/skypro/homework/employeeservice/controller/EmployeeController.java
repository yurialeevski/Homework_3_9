package ru.skypro.homework.employeeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.homework.employeeservice.employeeDB.Employee;
import ru.skypro.homework.employeeservice.service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/all-employees")
    public List<Employee> showAllEmployees() {
        return employeeService.getAllEmployees();
    }
    @GetMapping("/salary/sum")
    public int showSumEmployeeSalary() {
        return employeeService.getSumEmployeeSalary();
    }
    @GetMapping("/salary/min")
    public int showMinEmployeeSalary() {
        return employeeService.getMinEmployeeSalary();
    }
    @GetMapping("/salary/max")
    public int showMaxEmployeeSalary() { return employeeService.getMaxEmployeeSalary();}
    @GetMapping("/high-salary")
    public List<Employee> showHighSalaryEmployees() { return employeeService.getHighSalaryEmployees();}
}
