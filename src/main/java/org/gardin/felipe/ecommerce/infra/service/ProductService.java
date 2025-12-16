package org.gardin.felipe.ecommerce.infra.service;

import org.gardin.felipe.ecommerce.domain.Product;

import java.util.List;

public interface ProductService {

    Product create(Product product);

    Product update(Product product);

    Product searchOne(Long id);

    List<Product> searchAll();

    //Page<Product> searchAllPaginated();

    void delete(Long id);
}
