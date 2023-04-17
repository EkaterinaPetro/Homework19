package com.homework19.homework;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(String firstName, String lastName) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (firstName.equals(employee.getFirstName())
                    && lastName.equals(employee.getLastName())) {
                throw new EmployeeAlreadyAddedException();
            }
        }
        Employee employee = new Employee(firstName, lastName);
        employees.add(employee);
        System.out.println("Сотрудник добавлен");
        return employee;
    }

    public Employee deleteEmployee(String firstName, String lastName) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (firstName.equals(employee.getFirstName())
                    && lastName.equals(employee.getLastName())) {
                employees.remove(i);
                System.out.println("Сотрудник удален");
                return employee;
            }
        }
        throw new EmployeeNotFoundException();
    }
    public Employee findEmployee(String firstName, String lastName) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (firstName.equals(employee.getFirstName())
                    && lastName.equals(employee.getLastName())) {
                return employee;
            }
        }
        throw new EmployeeNotFoundException();
    }

    public List<Employee> printEmployees() {
        return employees;
    }
}
