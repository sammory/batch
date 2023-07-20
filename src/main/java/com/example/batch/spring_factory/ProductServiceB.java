package com.example.batch.spring_factory;

import com.example.batch.spring_factory.provider.ProductProvider;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceB implements ProductService {
    @Override
    public void use() {
        System.out.println("use B");
    }

    @Override
    public ProductProvider getProvider() {
        return ProductProvider.ProductB;
    }
}
