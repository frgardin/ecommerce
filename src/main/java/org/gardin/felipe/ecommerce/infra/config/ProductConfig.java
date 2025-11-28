package org.gardin.felipe.ecommerce.infra.config;

import org.gardin.felipe.ecommerce.application.gateway.ProductGateway;
import org.gardin.felipe.ecommerce.application.usecase.ProductCreateUseCase;
import org.gardin.felipe.ecommerce.application.usecase.impl.ProductCreateUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    public ProductCreateUseCase productCreateUseCase(ProductGateway productGateway) {
        return new ProductCreateUseCaseImpl(productGateway);
    }
}
