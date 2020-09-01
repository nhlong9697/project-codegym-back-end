package com.airbnb.clone.dto;

public class HouseResponse {
    private Long houseId;
    private String houseName;
    private String username;
    private String address;
    private String houseCategory;
    private String cityName;
    private String description;
    private Long price;

    public HouseResponse() {
    }

    public HouseResponse(Long houseId, String houseName, String username, String address, String houseCategory, String cityName, String description, Long price) {
        this.houseId = houseId;
        this.houseName = houseName;
        this.username = username;
        this.address = address;
        this.houseCategory = houseCategory;
        this.cityName = cityName;
        this.description = description;
        this.price = price;
    }

    public Long getHouseId() {
        return houseId;
    }

    public void setHouseId(Long houseId) {
        this.houseId = houseId;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHouseCategory() {
        return houseCategory;
    }

    public void setHouseCategory(String houseCategory) {
        this.houseCategory = houseCategory;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}