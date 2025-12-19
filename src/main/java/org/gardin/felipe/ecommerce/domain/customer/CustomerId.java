package org.gardin.felipe.ecommerce.domain.customer;

public record CustomerId(Long id) {
    public CustomerId {
        if (id == null) {
            throw new NullPointerException("Customer id cannot be null");
        }
    }
}
