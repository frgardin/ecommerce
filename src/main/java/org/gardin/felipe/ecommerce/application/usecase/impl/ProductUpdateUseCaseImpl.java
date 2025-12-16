package org.gardin.felipe.ecommerce.application.usecase.impl;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.UpdateUseCase;
import org.gardin.felipe.ecommerce.domain.Product;

public record ProductUpdateUseCaseImpl(ProductGateway productGateway) implements UpdateUseCase<Product> {
    @Override
    public Product execute(Product product) {
        return null;
    }
}
