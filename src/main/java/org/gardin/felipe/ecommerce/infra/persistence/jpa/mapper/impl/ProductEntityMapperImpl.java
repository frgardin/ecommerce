package org.gardin.felipe.ecommerce.infra.persistence.jpa.mapper.impl;

import org.gardin.felipe.ecommerce.domain.Product;
import org.gardin.felipe.ecommerce.infra.persistence.jpa.entity.ProductEntity;
import org.gardin.felipe.ecommerce.infra.persistence.jpa.mapper.ProductEntityMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductEntityMapperImpl implements ProductEntityMapper {

    @Override
    public Product toProductDomain(ProductEntity source) {
        if (source == null) {
            return null;
        }
        return new Product(
                source.getId(),
                source.getName(),
                source.getDisplayName(),
                source.getDescription(),
                source.getPrice(),
                source.getStock()
        );
    }

    @Override
    public ProductEntity toProductEntity(Product source) {
        if (source == null) {
            return null;
        }
        return new ProductEntity(source.getId(),
                source.getName(),
                source.getDisplayName(),
                source.getDescription(),
                source.getPrice(),
                source.getStock());
    }
}
