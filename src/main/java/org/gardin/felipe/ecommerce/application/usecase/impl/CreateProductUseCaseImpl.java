package org.gardin.felipe.ecommerce.application.usecase.impl;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.CreateProductUseCase;
import org.gardin.felipe.ecommerce.domain.product.Product;

public record CreateProductUseCaseImpl(ProductGateway productGateway)
        implements CreateProductUseCase {

    @Override
    public Product execute(Product product) {
        return productGateway.create(product).orElseThrow(() ->new RuntimeException("not found"));
    }
}
