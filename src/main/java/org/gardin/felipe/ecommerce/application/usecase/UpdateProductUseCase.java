package org.gardin.felipe.ecommerce.application.usecase;

import org.gardin.felipe.ecommerce.domain.Product;

public interface UpdateProductUseCase {

    Product execute(Product product);
}
