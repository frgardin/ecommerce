package org.gardin.felipe.ecommerce.infra.web.mapper.impl;

import org.gardin.felipe.ecommerce.domain.product.Product;
import org.gardin.felipe.ecommerce.domain.product.ProductId;
import org.gardin.felipe.ecommerce.infra.web.dto.request.ProductRequest;
import org.gardin.felipe.ecommerce.infra.web.dto.response.ProductResponse;
import org.gardin.felipe.ecommerce.infra.web.mapper.ProductDTOMapper;
import org.springframework.stereotype.Component;

@Component
public class ProductDTOMapperImpl implements ProductDTOMapper {

    @Override
    public ProductResponse toProductResponse(Product source) {
        if (source == null) {
            return null;
        }
        return new ProductResponse(source.getId().id(),
                source.getName(),
                source.getDisplayName(),
                source.getDescription(),
                source.getPrice(),
                source.getStock());
    }

    @Override
    public Product toProductDomain(ProductRequest source) {
        if (source == null) {
            return null;
        }
        return new Product(source.name(),
                source.displayName(),
                source.description(),
                source.price(),
                source.stock());
    }


    @Override
    public Product toProductDomain(Long id, ProductRequest source) {
        if (source == null) {
            return null;
        }
        return new Product(new ProductId(id), source.name(),
                source.displayName(),
                source.description(),
                source.price(),
                source.stock());
    }
}
