package org.gardin.felipe.ecommerce.infra.adapter;

import org.gardin.felipe.ecommerce.application.usecase.DeleteProductUseCase;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class DeleteProductTxAdapter {

    private final DeleteProductUseCase useCase;

    public DeleteProductTxAdapter(DeleteProductUseCase useCase) {
        this.useCase = useCase;
    }

    public void execute(Long id) {
        useCase.execute(id);
    }
}
