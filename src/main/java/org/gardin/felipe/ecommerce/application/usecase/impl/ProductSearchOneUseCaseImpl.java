package org.gardin.felipe.ecommerce.application.usecase.impl;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.SearchOneProductUseCase;
import org.gardin.felipe.ecommerce.domain.product.Product;

public record ProductSearchOneUseCaseImpl(
        ProductGateway productGateway
) implements SearchOneProductUseCase {
    @Override
    public Product retrieve(Long id) {
        return productGateway.searchOne(id).orElseThrow(() -> new RuntimeException("not found."));
    }
}
