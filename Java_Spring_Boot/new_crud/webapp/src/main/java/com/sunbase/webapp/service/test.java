package com.sunbase.webapp.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class test {
    public static void main(String[] args) {
        String login_id = "test";
        String password = "password";
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.createObjectNode()
                .put("login_id", login_id)
                .put("password", password);

        String jsonString;
        try {
            jsonString = objectMapper.writeValueAsString(jsonNode);
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        
    }
}
