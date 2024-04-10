package com.sunbase.webapp.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sunbase.webapp.model.Credential;
import com.sunbase.webapp.model.Customer;

@Service
public class CustomerService implements CustomerServiceInterface {

    @Override
    public String authenticate(String login_id, String password) {
        String url = "https://qa2.sunbasedata.com/sunbase/portal/api/assignment_auth.jsp";
        HttpClient client = HttpClient.newHttpClient();
        Credential credential = new Credential();
        credential.setLogin_id(login_id);
        credential.setPassword(password);
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
            
            String auth_token = "Bearer " + jsonResponse.get("access_token").asText();
            return auth_token;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }       
    }

    @Override
    public List<Customer> getAllEmployees() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllEmployees'");
    }

    @Override
    public void saveEmployee(Customer employee) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveEmployee'");
    }

    @Override
    public Customer getEmployeeById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmployeeById'");
    }

    @Override
    public void deleteEmployeeById(long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteEmployeeById'");
    }
    
}
