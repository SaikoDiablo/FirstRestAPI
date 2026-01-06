package com.example.FirstRestAPI.product.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateProductRequest {
    private final Long id;

    @JsonCreator
    public UpdateProductRequest(String brand, Long id) {
        super();
        this.id = id;

    }
    public Long getId() {
        return id;
    }

    public String getBrand() {
        return null;
    }
}
