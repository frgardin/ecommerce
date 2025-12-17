package org.gardin.felipe.ecommerce.application.usecase.impl;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.SearchAllProductsUseCase;
import org.gardin.felipe.ecommerce.domain.Product;

import java.util.List;

public record ProductSearchAllUseCaseImpl(ProductGateway productGateway)
        implements SearchAllProductsUseCase {
    @Override
    public List<Product> retrieve() {
        return productGateway.searchAll();
    }
}
