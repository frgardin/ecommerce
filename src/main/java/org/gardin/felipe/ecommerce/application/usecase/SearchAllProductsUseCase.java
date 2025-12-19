package org.gardin.felipe.ecommerce.application.usecase;

import org.gardin.felipe.ecommerce.domain.product.Product;

import java.util.List;

public interface SearchAllProductsUseCase {

    List<Product> retrieve();
}
