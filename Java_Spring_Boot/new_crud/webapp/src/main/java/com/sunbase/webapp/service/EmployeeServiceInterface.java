package com.sunbase.webapp.service;

import java.util.List;

import com.sunbase.webapp.model.Employee;

public interface EmployeeServiceInterface {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
