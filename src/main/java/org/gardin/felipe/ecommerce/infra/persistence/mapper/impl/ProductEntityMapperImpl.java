package org.gardin.felipe.ecommerce.infra.persistence.mapper.impl;

import org.gardin.felipe.ecommerce.domain.Product;
import org.gardin.felipe.ecommerce.infra.persistence.entity.ProductEntity;
import org.gardin.felipe.ecommerce.infra.persistence.mapper.ProductEntityMapper;
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
        return new ProductEntity(
                source.getName(),
                source.getDisplayName(),
                source.getDescription(),
                source.getPrice(),
                source.getStock());
    }

    @Override
    public ProductEntity update(Product source, ProductEntity target) {
        if (source == null || target == null) {
            return target;
        }

        target.setName(source.getName());
        target.setDisplayName(source.getDisplayName());
        target.setDescription(source.getDescription());
        target.setPrice(source.getPrice());
        target.setStock(source.getStock());

        return target;
    }
}
