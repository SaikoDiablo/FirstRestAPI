package com.example.FirstRestAPI.product.api.response;

public class ProductResponse{
    private final Long id;
    private final String brand;
    private final String model;

    public ProductResponse(Long id, String brand, String model){
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

}

