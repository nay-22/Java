package com.sunbase.webapp.service;

import java.util.List;

import com.sunbase.webapp.model.Customer;

public interface CustomerServiceInterface {
    String authenticate(String login_id, String password);
    List<Customer> getAllEmployees();
    void saveEmployee(Customer employee);
    Customer getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
