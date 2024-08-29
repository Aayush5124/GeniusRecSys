package com.example.Google.model;


import java.util.HashMap;
import java.util.Map;

public class Item {
    private String id;
    private Map<String, Double> features = new HashMap<>();

    public Item(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Map<String, Double> getFeatures() {
        return features;
    }

    public void addFeature(String feature, double value) {
        this.features.put(feature, value);
    }

    public String getName() {
   return getName();
    }
}