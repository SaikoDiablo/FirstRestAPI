package com.example.FirstRestAPI.product.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String brand;
    private String model;


    public Product(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
