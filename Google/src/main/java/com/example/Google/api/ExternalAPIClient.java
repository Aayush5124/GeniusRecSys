package com.example.Google.api;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ExternalAPIClient {

    public String fetchDataFromAPI(String endpoint) throws IOException {
        URL url = new URL(endpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        // Handle response
        return null; // Replace with actual implementation
    }
}
