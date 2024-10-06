package com.example.jdbc.adapter;

import com.example.jdbc.model.Employee;
import com.example.jdbc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeAdapterImpl implements EmployeeAdapter {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public String createEmployee(Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeService.getEmployeeById(id);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @Override
    public String updateEmployee(Long id, Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @Override
    public String deleteEmployee(Long id) {
        return employeeService.deleteEmployee(id);
    }
}
