package org.gardin.felipe.ecommerce.application.usecase;

import org.gardin.felipe.ecommerce.domain.product.Product;

public interface CreateProductUseCase {

    Product execute(Product product);
}
