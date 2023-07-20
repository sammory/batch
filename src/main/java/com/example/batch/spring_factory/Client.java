package com.example.batch.spring_factory;

import com.example.batch.spring_factory.provider.ProductProvider;
import com.example.batch.spring_factory.provider.ProductProviderFactory;
import org.springframework.stereotype.Component;

@Component
public class Client {
    private final ProductProviderFactory productProviderFactory;

    public Client(ProductProviderFactory productProviderFactory) {
        this.productProviderFactory = productProviderFactory;
    }

    public void doService(ProductProvider provider){
        ProductService service = productProviderFactory.getService(provider);

        service.use();
    }
}
