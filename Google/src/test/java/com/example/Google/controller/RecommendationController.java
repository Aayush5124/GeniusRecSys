package com.example.controller;

import com.example.Google.model.Item;
import com.example.Google.service.RecommendationService;

import java.util.List;

public class RecommendationController {

    private RecommendationService recommendationService = new RecommendationService();

    public List<Item> getRecommendations(String itemId, int topN) {
        // Fetch item by ID and get recommendations
        return recommendationService.recommendItems(new Item(itemId), topN);
    }
}
