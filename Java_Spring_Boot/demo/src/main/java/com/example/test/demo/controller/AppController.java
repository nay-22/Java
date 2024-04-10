package com.example.test.demo.controller;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.test.demo.model.AuthRequest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class AppController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/login")
    public String userRegistration(@ModelAttribute AuthRequest credentails) {
        String url = "https://qa2.sunbasedata.com/sunbase/portal/api/assignment_auth.jsp";
        HttpClient client = HttpClient.newHttpClient();
        String body = "{\"login_id\" : \"test@sunbasedata.com\",\"password\" :\"Test@123\"}";
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .POST(HttpRequest.BodyPublishers.ofString(body))
            .build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String responseBody = response.body();

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonResponse = objectMapper.readTree(responseBody);
            
            String accessToken = jsonResponse.get("access_token").asText();
            System.out.println(accessToken);
            return accessToken;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "Error";
        }
    }
}
