package org.gardin.felipe.ecommerce.application.usecase.impl;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.SearchOneUseCase;
import org.gardin.felipe.ecommerce.domain.Product;

public record ProductSearchOneUseCaseImpl(
        ProductGateway productGateway
) implements SearchOneUseCase<Product, Long> {
    @Override
    public Product execute(Long aLong) {
        return null;
    }
}
