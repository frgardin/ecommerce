package org.gardin.felipe.ecommerce.infra.service.impl;

import org.gardin.felipe.ecommerce.application.usecase.*;
import org.gardin.felipe.ecommerce.domain.Product;
import org.gardin.felipe.ecommerce.infra.service.ProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class ProductServiceImpl implements ProductService {

    private final CreateUseCase<Product> productCreateUseCase;
    private final UpdateUseCase<Product> productUpdateUseCase;
    private final SearchOneUseCase<Product, Long> productSearchOneUseCase;
    private final SearchAllUseCase<Product> productSearchAllUseCase;
    private final DeleteUseCase<Long> productDeleteUseCase;

    public ProductServiceImpl(CreateUseCase<Product> productCreateUseCase,
                              UpdateUseCase<Product> productUpdateUseCase,
                              SearchOneUseCase<Product, Long> productSearchOneUseCase,
                              SearchAllUseCase<Product> productSearchAllUseCase,
                              DeleteUseCase<Long> productDeleteUseCase) {
        this.productCreateUseCase = productCreateUseCase;
        this.productUpdateUseCase = productUpdateUseCase;
        this.productSearchOneUseCase = productSearchOneUseCase;
        this.productSearchAllUseCase = productSearchAllUseCase;
        this.productDeleteUseCase = productDeleteUseCase;
    }

    @Override
    @Transactional
    public Product create(Product product) {
        return productCreateUseCase.execute(product);
    }

    @Override
    @Transactional
    public Product update(Product product) {
        return productUpdateUseCase.execute(product);
    }

    @Override
    public Product searchOne(Long id) {
        return productSearchOneUseCase.execute(id);
    }

    @Override
    public List<Product> searchAll() {
        return productSearchAllUseCase.execute();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        productDeleteUseCase.execute(id);
    }
}
