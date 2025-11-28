package org.gardin.felipe.ecommerce.application.gateway;

import org.gardin.felipe.ecommerce.domain.Product;

public interface ProductGateway {

    Product save(Product product);
}
