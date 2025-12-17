package org.gardin.felipe.ecommerce.application.usecase.impl;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.UpdateProductUseCase;
import org.gardin.felipe.ecommerce.domain.Product;

public record ProductUpdateUseCaseImpl(ProductGateway productGateway) implements UpdateProductUseCase {
    @Override
    public Product execute(Product product) {
        return productGateway.update(product).orElseThrow(() -> new RuntimeException("not found."));
    }
}
