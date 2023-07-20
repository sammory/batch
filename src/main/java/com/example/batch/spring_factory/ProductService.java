package com.example.batch.spring_factory;

import com.example.batch.spring_factory.provider.ProductProvider;

public interface ProductService {
    void use();
    ProductProvider getProvider();
}
