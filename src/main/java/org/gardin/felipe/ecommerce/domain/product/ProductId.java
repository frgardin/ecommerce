package org.gardin.felipe.ecommerce.domain.product;

public record ProductId(Long id) {
    public ProductId {
        if (id == null) {
            throw new NullPointerException("Product id cannot be null.");
        }
    }

}
