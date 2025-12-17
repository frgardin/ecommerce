package org.gardin.felipe.ecommerce.infra.adapter;

import org.gardin.felipe.ecommerce.application.usecase.CreateProductUseCase;
import org.gardin.felipe.ecommerce.domain.Product;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class CreateProductTxAdapter {

    private final CreateProductUseCase useCase;

    public CreateProductTxAdapter(CreateProductUseCase useCase) {
        this.useCase = useCase;
    }

    public Product execute(Product product) {
        return useCase.execute(product);
    }
}
