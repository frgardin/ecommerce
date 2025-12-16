package org.gardin.felipe.ecommerce.infra.config;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.*;
import org.gardin.felipe.ecommerce.application.usecase.impl.*;
import org.gardin.felipe.ecommerce.domain.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    public CreateUseCase<Product> productCreateUseCase(ProductGateway productGateway) {
        return new ProductCreateUseCaseImpl(productGateway);
    }

    @Bean
    public UpdateUseCase<Product> productUpdateUseCase(ProductGateway productGateway) {
        return new ProductUpdateUseCaseImpl(productGateway);
    }

    @Bean
    public SearchOneUseCase<Product, Long> productSearchOneUseCase(ProductGateway productGateway) {
        return new ProductSearchOneUseCaseImpl(productGateway);
    }

    @Bean
    public SearchAllUseCase<Product> productSearchAllUseCase(ProductGateway productGateway) {
        return new ProductSearchAllUseCaseImpl(productGateway);
    }

    @Bean
    public DeleteUseCase<Long> productDeleteUseCase(ProductGateway productGateway) {
        return new ProductDeleteUseCaseImpl(productGateway);
    }
}
