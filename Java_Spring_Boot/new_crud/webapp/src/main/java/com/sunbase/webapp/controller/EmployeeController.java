package com.sunbase.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sunbase.webapp.model.Employee;
import com.sunbase.webapp.service.EmployeeService;

@Controller
public class EmployeeController {
    
    @Autowired
    private EmployeeService empService;

    // display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployees", empService.getAllEmployees());
        return "index";
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        Employee emp = new Employee();
        model.addAttribute("employee", emp);
        return "new_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        empService.saveEmployee(employee);
        return "redirect:/"; //redirects to homepage
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        Employee employee = empService.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "update_employee";
    }

    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id) {
        this.empService.deleteEmployeeById(id);
        return "redirect:/";
    }
}
