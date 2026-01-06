package com.example.FirstRestAPI.product.api.request;
import com.fasterxml.jackson.annotation.JsonCreator;

public class ProductRequest {
    private final String brand;
    private final String model;
    private final String year;

    @JsonCreator
    public ProductRequest(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

}


