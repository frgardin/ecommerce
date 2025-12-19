package org.gardin.felipe.ecommerce.infra.adapter;

import org.gardin.felipe.ecommerce.application.usecase.SearchOneProductUseCase;
import org.gardin.felipe.ecommerce.domain.product.Product;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional(readOnly = true)
public class SearchOneProductTxAdapter {

    private final SearchOneProductUseCase useCase;

    public SearchOneProductTxAdapter(SearchOneProductUseCase useCase) {
        this.useCase = useCase;
    }

    public Product retrieve(Long id) {
        return useCase.retrieve(id);
    }
}
