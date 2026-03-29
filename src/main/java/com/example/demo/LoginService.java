package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    // ❌ Hardcoded secret (VULNERABILITY)
    private String dbPassword = "admin123";

    public boolean login(String username, String password) {

        // ❌ SQL Injection vulnerability
        String query = "SELECT * FROM users WHERE username='" + username +
                "' AND password='" + password + "'";

        System.out.println("Executing query: " + query);

        // Dummy logic (simulate login success)
        if (username.equals("admin") && password.equals("admin")) {
            return true;
        }
        return false;
    }
}