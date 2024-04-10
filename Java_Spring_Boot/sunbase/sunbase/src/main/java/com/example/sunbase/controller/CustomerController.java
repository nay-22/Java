package com.example.sunbase.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sunbase.model.Credential;
import com.example.sunbase.service.CustomerService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.ui.Model;

@Controller
public class CustomerController {
    private String token;
    @Autowired
    private CustomerService service;

    @GetMapping("/") 
    public String viewIndex(Model model) {
        model.addAttribute("listCustomers", service.getCustomers());
        return "index";
    }

    @PostMapping("/auth")
    public String auth(@ModelAttribute(value = "creds") Credential creds) {
        String url = "https://qa2.sunbasedata.com/sunbase/portal/api/assignment_auth.jsp";
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mappedCredentials = new ObjectMapper();
        String body = "";
        try {
            body = mappedCredentials.writeValueAsString(creds);
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonResponse = objectMapper.readTree(responseBody);
            
            token = "Bearer " + jsonResponse.get("access_token").asText();
            System.out.println(token);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }   
        return "redirect:/";    
    }
}
