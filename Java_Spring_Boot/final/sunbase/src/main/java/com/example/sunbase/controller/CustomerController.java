package com.example.sunbase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sunbase.model.Credential;
import com.example.sunbase.service.CustomerService;

import org.springframework.ui.Model;

import javax.


@Controller
public class CustomerController {
    private static String token;
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
        if (bearer != "") {
            token = bearer;
            return "redirect:/customers";
        }
        return "redirect:/";
    }


    @GetMapping("/customers") 
    public String viewHome(Model model) {
        System.out.println("\n\n\n\n" + token);
        model.addAttribute("listCustomers", service.getCustomers(token));
        return "home";
    }
}
