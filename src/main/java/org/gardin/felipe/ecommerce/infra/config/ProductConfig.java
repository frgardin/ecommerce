package org.gardin.felipe.ecommerce.infra.config;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.*;
import org.gardin.felipe.ecommerce.application.usecase.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    public CreateProductUseCase productCreateUseCase(ProductGateway productGateway) {
        return new CreateProductUseCaseImpl(productGateway);
    }

    @Bean
    public UpdateProductUseCase productUpdateUseCase(ProductGateway productGateway) {
        return new ProductUpdateUseCaseImpl(productGateway);
    }

    @Bean
    public SearchOneProductUseCase productSearchOneUseCase(ProductGateway productGateway) {
        return new ProductSearchOneUseCaseImpl(productGateway);
    }

    @Bean
    public SearchAllProductsUseCase productSearchAllUseCase(ProductGateway productGateway) {
        return new ProductSearchAllUseCaseImpl(productGateway);
    }

    @Bean
    public DeleteProductUseCase productDeleteUseCase(ProductGateway productGateway) {
        return new DeleteProductUseCaseImpl(productGateway);
    }
}
