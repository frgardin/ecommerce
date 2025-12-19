package org.gardin.felipe.ecommerce.application.gateway;

import org.gardin.felipe.ecommerce.domain.product.Product;

import java.util.List;
import java.util.Optional;

public interface ProductGateway {

    Optional<Product> create(Product product);

    Optional<Product> update(Product product);

    List<Product> searchAll();

    Optional<Product> searchOne(Long id);

    void delete(Long id);
}
