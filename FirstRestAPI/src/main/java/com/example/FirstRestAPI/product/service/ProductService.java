package com.example.FirstRestAPI.product.service;

import com.example.FirstRestAPI.product.api.request.ProductRequest;
import com.example.FirstRestAPI.product.api.request.UpdateProductRequest;
import com.example.FirstRestAPI.product.api.response.ProductResponse;
import com.example.FirstRestAPI.product.domain.Product;
import com.example.FirstRestAPI.product.repository.ProductRepository;
import com.example.FirstRestAPI.product.support.ProductExceptionSupplier;
import com.example.FirstRestAPI.product.support.ProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public ProductService(ProductRepository productRepository, ProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;

    }
    public ProductResponse create(ProductRequest productRequest) {
        Product product = productRepository.save(productMapper.toProduct(productRequest));
        return productMapper.toProductResponse(product);
    }
    public ProductResponse find(Long id) {
        Product product = productRepository.findById(id).orElseThrow(ProductExceptionSupplier.productNotFound(id));
        return productMapper.toProductResponse(product);
    }

    public List<ProductResponse> findAll() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::toProductResponse)
                .toList();
    }

    public ProductResponse update(Long id, UpdateProductRequest updateProductRequest) {
        Product product = productRepository.findById(id).orElseThrow(
                ProductExceptionSupplier.productNotFound(id)
        );
        productRepository.save(productMapper.toProduct(product, updateProductRequest));
        return productMapper.toProductResponse(product);
    }
    public void delete(Long id) {
        Product product = productRepository.findById(id).orElseThrow(ProductExceptionSupplier.productNotFound(id));
        productRepository.deleteById(product.getId());
    }
}
