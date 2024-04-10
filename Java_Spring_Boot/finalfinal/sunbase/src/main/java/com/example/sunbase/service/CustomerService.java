package com.example.sunbase.service;

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
    // private static String token = "";

    // public static void main(String[] args) {
    //     // getCustomers(token);
    //     Credential cred = new Credential();
    //     cred.setLogin_id("test@sunbasedata.com");
    //     cred.setPassword("Test@123");
    //     authenticate(cred);
    // Customer customer = getCustomerByUUID("test20813fe3079a45e18a77a7462961d92a", token);
    // System.out.println(customer.toString());
    // }

    public String authenticate(Credential credential) {
        System.out.println(credential.toString());
        String url = "https://qa2.sunbasedata.com/sunbase/portal/api/assignment_auth.jsp";
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
            System.out.println(response.statusCode());

            if (response.statusCode() == 200) {
                String responseBody = response.body();
                
                ObjectMapper objectMapper = new ObjectMapper();
                JsonNode jsonResponse = objectMapper.readTree(responseBody);
                String token = "Bearer " + jsonResponse.get("access_token").asText();
                return token;
            } else {
                System.out.println("Failed HTTP Authentication");
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }   
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
            // for (Customer customer : customers) {
            //     System.out.println(customer.toString());
            // }
        } catch(Exception e) {
            System.out.println(e);
        }
        return customers;
    }

    public void saveCustomer(Customer customer, String token) {
        String url = "https://qa2.sunbasedata.com/sunbase/portal/api/assignment.jsp?cmd=create";
        HttpClient client = HttpClient.newHttpClient();
        System.out.println("Token = " + token);
        ObjectMapper mappedCustomer = new ObjectMapper();
        String body = "";
        try {
            body = mappedCustomer.writeValueAsString(customer);
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", token)
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            if (response.statusCode() == 201) {
                System.out.println("Added New Customer");
            } else {
                System.out.println("Failed to add new customer");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Customer getCustomerByUUID(String uuid, String token) {
        System.out.println("----------- UPDATE -----------------");
        String url = "https://qa2.sunbasedata.com/sunbase/portal/api/assignment.jsp?cmd=update";
        Customer customer = null;
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", token)
                .GET()
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            String responseBody = response.body();
            ObjectMapper objectMapper = new ObjectMapper();
            customer = objectMapper.readValue(responseBody, Customer.class);
        } catch(Exception e) {
            System.out.println(e);
        }
        System.out.println(customer.toString());
        return customer;
    }

    public void updateCustomer(Customer customer, String token) {
        String url = "https://qa2.sunbasedata.com/sunbase/portal/api/assignment.jsp?cmd=update";
        HttpClient client = HttpClient.newHttpClient();
        ObjectMapper mappedCustomer = new ObjectMapper();
        try {
            String body = mappedCustomer.writeValueAsString(customer);
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", token)
                .PUT(HttpRequest.BodyPublishers.ofString(body))  // Use PUT method for updates
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            if (response.statusCode() == 200) {
                System.out.println("Updated Customer");
            } else {
                System.out.println("Failed to update customer");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }
    
    public void delete(String uuid, String token) {
        String url = "https://qa2.sunbasedata.com/sunbase/portal/api/assignment.jsp?cmd=delete&uuid=" + uuid;
        HttpClient client = HttpClient.newHttpClient();
        try {
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", token)
                .DELETE()
                .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            if (response.statusCode() == 200) {
                System.out.println("Successfully Deleted");
            } else if (response.statusCode() == 400) {
                System.out.println("UUID not found");
            } else {
                System.out.println(response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }






}
