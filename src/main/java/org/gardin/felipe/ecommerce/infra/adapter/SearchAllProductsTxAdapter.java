package org.gardin.felipe.ecommerce.infra.adapter;

import org.gardin.felipe.ecommerce.application.usecase.SearchAllProductsUseCase;
import org.gardin.felipe.ecommerce.domain.product.Product;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional(readOnly = true)
public class SearchAllProductsTxAdapter {

    private final SearchAllProductsUseCase useCase;

    public SearchAllProductsTxAdapter(SearchAllProductsUseCase useCase) {
        this.useCase = useCase;
    }

    public List<Product> retrieve() {
        return useCase.retrieve();
    }
}
