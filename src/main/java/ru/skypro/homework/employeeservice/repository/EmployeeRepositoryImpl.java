package ru.skypro.homework.employeeservice.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.homework.employeeservice.employeeDB.Employee;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    // Коллекция для имитации данных
    private final List<Employee> employeeList = List.of(
            new Employee("Катя", 90_000),
            new Employee("Дима", 102_000),
            new Employee("Олег", 80_000),
            new Employee("Вика", 165_000));

    @Override
    public List<Employee> getAllEmployees() {
        return employeeList;
    }

    @Override
    public int getSumSalary() {
        int sum = 0;
        for(Employee employee: employeeList) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    @Override
    public int getMinSalary() {
        int min = employeeList.get(0).getSalary();
        for(int i = 1; i < employeeList.size(); i++) {
            if(employeeList.get(i).getSalary() < min) {
                min = employeeList.get(i).getSalary();
            }
        }
        return min;
    }

    @Override
    public int getMaxSalary() {
        int max = employeeList.get(0).getSalary();
        for(int i = 1; i < employeeList.size(); i++) {
            if(employeeList.get(i).getSalary() > max) {
                max = employeeList.get(i).getSalary();
            }
        }
        return max;
    }

    @Override
    public List<Employee> getHighSalary() {
        int sum = getSumSalary();
        int average = sum / employeeList.size();
        List<Employee> empl = new ArrayList<>();
        for(Employee employee: employeeList) {
            if(employee.getSalary() > average) {
                empl.add(employee);
            }
        }
        return empl;
    }
}
