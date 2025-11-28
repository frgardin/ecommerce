package org.gardin.felipe.ecommerce.infra.persistence.jpa.mapper;

import org.gardin.felipe.ecommerce.domain.Product;
import org.gardin.felipe.ecommerce.infra.persistence.jpa.entity.ProductEntity;

public interface ProductEntityMapper {

    Product toProductDomain(ProductEntity source);

    ProductEntity toProductEntity(Product source);
}
