package com.example.sunbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.sunbase.model.Credential;
import com.example.sunbase.model.Customer;
import com.example.sunbase.service.CustomerService;

import org.springframework.ui.Model;


@Controller
@SessionAttributes("token")
public class CustomerController {
    @Autowired
    private CustomerService service;

    @GetMapping("/")
    public String viewIndex(Model model) {
        model.addAttribute("credential", new Credential());
        return "index";
    }

    @PostMapping("/auth")
    public String authenticate(@ModelAttribute("credential") Credential credential, Model model) {
        String bearer = service.authenticate(credential);
        if (bearer != null) {
            model.addAttribute("token", bearer);
            return "redirect:/customers";
        }
        return "redirect:/";
    }


    @GetMapping("/customers") 
    public String viewHome(Model model) {
        System.out.println("\n\n\n\n" + model.getAttribute("token"));
        model.addAttribute("listCustomers", service.getCustomers((String)model.getAttribute("token")));
        return "home";
    }

    @GetMapping("/add")
    public String addNewCustomer(Model model) {
        if (model.getAttribute("token") != null) {
            model.addAttribute("customer", new Customer());
            return "add_customer";
        }
        return "redirect:/";
    }

    @PostMapping("/saveCustomer") 
    public String saveCustomer(@ModelAttribute("customer") Customer customer, Model model) {
        if (model.getAttribute("token") != null) {
            service.saveCustomer(customer, (String)model.getAttribute("token"));
            return "redirect:/customers";
        }
        return "redirect:/";
    }

    @GetMapping("update/{id}")
    public String updateExistingCustomer(@PathVariable(value = "id") String uuid, Model model) {
        if (model.getAttribute("token") != null) {
            Customer customer = service.getCustomerByUUID(uuid, (String)model.getAttribute("token"));
            if (customer != null) {
                model.addAttribute("customer", customer);
                return "add_customer";
            } else {
                return "redirect:/customers";
            }
        }
        return "redirect:/";
    }

    @GetMapping("/delete{id}")
    public String deleteCustomer(@PathVariable(value = "id")String uuid, Model model) {
        if (model.getAttribute("token") != null) {
            service.delete(uuid, (String)model.getAttribute("token"));
            return "redirct:/customers";
        }
        return "redirect:/";
    }
    
}
