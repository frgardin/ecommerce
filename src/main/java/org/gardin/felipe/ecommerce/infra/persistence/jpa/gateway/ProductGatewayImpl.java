package org.gardin.felipe.ecommerce.infra.persistence.jpa.gateway;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.domain.Product;
import org.gardin.felipe.ecommerce.infra.persistence.jpa.mapper.ProductEntityMapper;
import org.gardin.felipe.ecommerce.infra.persistence.jpa.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class ProductGatewayImpl implements ProductGateway {

    private final ProductRepository productRepository;
    private final ProductEntityMapper productEntityMapper;

    public ProductGatewayImpl(ProductRepository productRepository, ProductEntityMapper productEntityMapper) {
        this.productRepository = productRepository;
        this.productEntityMapper = productEntityMapper;
    }


    @Override
    public Product save(Product product) {
        return Optional.ofNullable(productEntityMapper.toProductEntity(product))
                .map(productRepository::save)
                .map(productEntityMapper::toProductDomain)
                .orElse(null);
    }
}
