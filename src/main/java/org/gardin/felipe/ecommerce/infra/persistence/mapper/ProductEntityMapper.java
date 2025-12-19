package org.gardin.felipe.ecommerce.infra.persistence.mapper;

import org.gardin.felipe.ecommerce.domain.product.Product;
import org.gardin.felipe.ecommerce.infra.persistence.entity.ProductEntity;

public interface ProductEntityMapper {

    Product toProductDomain(ProductEntity source);

    ProductEntity toProductEntity(Product source);

    ProductEntity update(Product source, ProductEntity target);
}
