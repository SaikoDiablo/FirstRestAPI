package com.example.FirstRestAPI.product.support;

import com.example.FirstRestAPI.product.api.request.UpdateProductRequest;
import org.springframework.stereotype.Component;
import com.example.FirstRestAPI.product.api.request.ProductRequest;
import com.example.FirstRestAPI.product.api.response.ProductResponse;
import com.example.FirstRestAPI.product.domain.Product;

@Component
public class ProductMapper {
    public Product toProduct(ProductRequest request) {
        return new Product(request.getBrand(), request.getModel());
    }

    public Product toProduct(Product product, UpdateProductRequest updateProductRequest) {
        product.setBrand(updateProductRequest.getBrand());
        return product;
    }

    public ProductResponse toProductResponse(Product product) {
        return new ProductResponse(product.getId(), product.getBrand(), product.getModel());
    }
}