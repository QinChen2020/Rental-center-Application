package com.example.rental_centre_app.model;

public class RecentsData {

    String houseName;
    String locationName;
    String price;
    Integer imageUrl;

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public RecentsData(String houseName, String locationName, String price, Integer imageUrl) {
        this.houseName = houseName;
        this.locationName = locationName;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
