package com.robillo.droughtprotect.model;

@SuppressWarnings("unused")
public class Feature {

    private String feature;
    private String description;
    private String imageUrl;

    public Feature(String feature, String description, String imageUrl) {
        this.feature = feature;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
