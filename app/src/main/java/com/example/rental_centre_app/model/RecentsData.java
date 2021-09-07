package com.example.rental_centre_app.model;

public class RecentsData {

    String houseName;
    String locationName;
    String price;

    public RecentsData(String houseName, String locationName, String price) {
        this.houseName = houseName;
        this.locationName = locationName;
        this.price = price;
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
