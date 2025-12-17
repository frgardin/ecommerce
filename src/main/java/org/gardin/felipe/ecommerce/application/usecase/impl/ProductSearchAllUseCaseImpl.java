package org.gardin.felipe.ecommerce.application.usecase.impl;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.SearchAllUseCase;
import org.gardin.felipe.ecommerce.domain.Product;

import java.util.List;

public record ProductSearchAllUseCaseImpl(ProductGateway productGateway) implements SearchAllUseCase<Product> {
    @Override
    public List<Product> execute() {
        return productGateway.searchAll();
    }
}
