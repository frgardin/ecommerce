package org.gardin.felipe.ecommerce.infra.persistence.gateway;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.domain.product.Product;
import org.gardin.felipe.ecommerce.infra.persistence.mapper.ProductEntityMapper;
import org.gardin.felipe.ecommerce.infra.persistence.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
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
    public Optional<Product> create(Product product) {
        return Optional.ofNullable(productEntityMapper.toProductEntity(product))
                .map(productRepository::save)
                .map(productEntityMapper::toProductDomain);
    }

    @Override
    public Optional<Product> update(Product product) {
        return productRepository.findById(product.getId().id())
                .map(productEntity -> productEntityMapper.update(product, productEntity))
                .map(productEntityMapper::toProductDomain);
    }

    @Override
    public List<Product> searchAll() {
        return productRepository.findAll().stream()
                .map(productEntityMapper::toProductDomain)
                .toList();
    }

    @Override
    public Optional<Product> searchOne(Long id) {
        return productRepository.findById(id)
                .map(productEntityMapper::toProductDomain);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
