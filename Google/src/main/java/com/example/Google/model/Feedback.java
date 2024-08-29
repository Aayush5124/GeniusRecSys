package com.example.Google.model;


public class Feedback {
    private String userId;
    private String itemId;
    private int rating;

    public Feedback(String userId, String itemId, int rating) {
        this.userId = userId;
        this.itemId = itemId;
        this.rating = rating;
    }

    public String getUserId() {
        return userId;
    }

    public String getItemId() {
        return itemId;
    }

    public int getRating() {
        return rating;
    }
}
