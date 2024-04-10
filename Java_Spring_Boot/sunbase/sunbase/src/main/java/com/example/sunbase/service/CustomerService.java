package com.example.sunbase.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sunbase.model.Customer;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class CustomerService {
    private static String token = "Bearer dGVzdEBzdW5iYXNlZGF0YS5jb206VGVzdEAxMjM=";

    public List<Customer> getCustomers() {
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
        } catch(Exception e) {
            System.out.println(e);
        }
        return customers;
    }
}
