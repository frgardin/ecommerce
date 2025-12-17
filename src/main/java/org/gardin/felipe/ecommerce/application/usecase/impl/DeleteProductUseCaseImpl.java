package org.gardin.felipe.ecommerce.application.usecase.impl;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.DeleteProductUseCase;

public record DeleteProductUseCaseImpl(ProductGateway productGateway)
        implements DeleteProductUseCase {
    @Override
    public void execute(Long id) {
        productGateway.delete(id);
    }
}
