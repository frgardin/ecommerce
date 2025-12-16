package org.gardin.felipe.ecommerce.application.usecase.impl;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.CreateUseCase;
import org.gardin.felipe.ecommerce.domain.Product;

public record ProductCreateUseCaseImpl(ProductGateway productGateway)
        implements CreateUseCase<Product> {

    @Override
    public Product execute(Product product) {
        return productGateway.create(product).orElseThrow(() ->new RuntimeException("not found"));
    }
}
