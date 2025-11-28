package org.gardin.felipe.ecommerce.application.usecase.impl;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.ProductCreateUseCase;
import org.gardin.felipe.ecommerce.domain.Product;

public class ProductCreateUseCaseImpl implements ProductCreateUseCase {

    private final ProductGateway productGateway;

    public ProductCreateUseCaseImpl(ProductGateway productGateway) {
        this.productGateway = productGateway;
    }

    @Override
    public Product execute(Product product) {
        return productGateway.save(product);
    }
}
