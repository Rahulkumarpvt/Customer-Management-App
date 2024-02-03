package com.example.rahul.SunBaseApiClient.entity;

import java.net.http.HttpHeaders;

public class AuthenticationUtitlity {
	private static final String AUTH_API_URL = "https://qa.sunbasedata.com/sunbase/portal/api/assignment_auth.jsp";
    private static final String LOGIN_ID = "test@sunbasedata.com";
    private static final String PASSWORD = "Test@123";
    private static final String SECRET_KEY = "yourSecretKey"; // Replace with a secure secret key

    public static String authenticateAndGetJwtToken() {
        
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");

}
