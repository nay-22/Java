package com.sunbase.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunbase.webapp.model.Employee;

@Repository
public interface EmployeeRepoInterface extends JpaRepository<Employee, Long> {
    
}
