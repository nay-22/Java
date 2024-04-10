package com.example.sunbase.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sunbase.model.Credential;
import com.example.sunbase.model.Customer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CustomerService {
    // private static String token = "Bearer dGVzdEBzdW5iYXNlZGF0YS5jb206VGVzdEAxMjM=";
    private static String token = "";

    public String authenticate(Credential credential) {
        String url = "https://qa2.sunbasedata.com/sunbase/portal/api/assignment.jsp";
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mappedCredentials = new ObjectMapper();
        String body = "";
        try {
            body = mappedCredentials.writeValueAsString(credential);
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
        return token; 
    }

    public List<Customer> getCustomers(String token) {
        List<Customer> customers = new ArrayList<>();
        String url = "https://qa2.sunbasedata.com/sunbase/portal/api/assignment.jsp?cmd=get_customer_list";
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", token)
                .GET()
                .build();
                        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            ObjectMapper objectMapper = new ObjectMapper();
            customers = objectMapper.readValue(responseBody, new TypeReference<List<Customer>>() {});
            for (Customer customer : customers) {
                System.out.println(customer.toString());
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        return customers;
    }
}
