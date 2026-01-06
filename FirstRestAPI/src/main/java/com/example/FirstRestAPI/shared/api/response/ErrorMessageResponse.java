package com.example.FirstRestAPI.shared.api.response;

import com.example.FirstRestAPI.product.api.request.UpdateProductRequest;
import com.example.FirstRestAPI.product.api.response.ProductResponse;
import com.example.FirstRestAPI.product.domain.Product;
import com.example.FirstRestAPI.product.support.ProductExceptionSupplier;

public class ErrorMessageResponse {
    private final String message;

    public ErrorMessageResponse(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

}
