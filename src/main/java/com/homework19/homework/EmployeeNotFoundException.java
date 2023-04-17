package com.homework19.homework;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException() {
        super("Сотрудник не найден");
    }
}
