package com.sunbase.webapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbase.webapp.model.Employee;
import com.sunbase.webapp.repository.EmployeeRepoInterface;

// import jakarta.transaction.Transactional;

@Service
// @Transactional //Internally handled by JPA
public class EmployeeService implements EmployeeServiceInterface {

    @Autowired
    private EmployeeRepoInterface empRepo;

    @Override
    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        this.empRepo.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> optional = empRepo.findById(id);
        Employee employee = null;
        if (optional.isPresent()) {
            employee = optional.get();
        } else {
            throw new RuntimeException("Employee Not Found for ID : " + id);
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id) {
        this.empRepo.deleteById(id);
    }
    
}
