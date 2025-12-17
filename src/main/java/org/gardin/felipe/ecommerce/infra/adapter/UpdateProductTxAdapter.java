package org.gardin.felipe.ecommerce.infra.adapter;

import org.gardin.felipe.ecommerce.application.usecase.UpdateProductUseCase;
import org.gardin.felipe.ecommerce.domain.Product;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class UpdateProductTxAdapter {

    private final UpdateProductUseCase useCase;

    public UpdateProductTxAdapter(UpdateProductUseCase useCase) {
        this.useCase = useCase;
    }

    public Product execute(Product product) {
        return useCase.execute(product);
    }
}
