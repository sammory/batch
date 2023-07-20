package com.example.batch.spring_factory.provider;

import com.example.batch.spring_factory.ProductService;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class ProductProviderFactory {
    private final List<ProductService> products;

    private HashMap<ProductProvider, ProductService> map = new HashMap<>();

    public ProductProviderFactory(List<ProductService> products) {
        this.products = products;
        for (ProductService product : products) {
            this.map.put(product.getProvider(), product);
        }
    }

    public ProductService getService(ProductProvider provider){
        return this.map.get(provider);
    }
}
