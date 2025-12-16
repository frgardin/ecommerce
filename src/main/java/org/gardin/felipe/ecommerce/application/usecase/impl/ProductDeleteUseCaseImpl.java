package org.gardin.felipe.ecommerce.application.usecase.impl;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.DeleteUseCase;

public record ProductDeleteUseCaseImpl(ProductGateway productGateway) implements DeleteUseCase<Long> {
    @Override
    public void execute(Long aLong) {

    }
}
