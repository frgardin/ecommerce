package org.gardin.felipe.ecommerce.domain.order;

import java.util.UUID;

public record OrderId(UUID id) {

    public OrderId {
        if (id == null) {
            throw new NullPointerException("Order id cannot be null");
        }
    }
}
