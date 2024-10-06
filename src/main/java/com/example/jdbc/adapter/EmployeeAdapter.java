package com.example.jdbc.adapter;

import com.example.jdbc.model.Employee;

import java.util.List;

public interface EmployeeAdapter {
    String createEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    String updateEmployee(Long id, Employee employee);
    String deleteEmployee(Long id);
}
