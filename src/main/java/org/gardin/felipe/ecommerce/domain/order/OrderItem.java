package org.gardin.felipe.ecommerce.domain.order;

import org.gardin.felipe.ecommerce.domain.exception.InvalidOrderItemException;
import org.gardin.felipe.ecommerce.domain.product.ProductId;

import java.math.BigDecimal;

public class OrderItem {

    private final ProductId productId;
    private final int quantity;
    private final BigDecimal unitPrice;

    public OrderItem(ProductId productId, int quantity, BigDecimal unitPrice) {
        if (productId == null) {
            throw new InvalidOrderItemException("ProductId is required");
        }
        if (quantity <= 0) {
            throw new InvalidOrderItemException("Quantity must be greater than zero");
        }
        if (unitPrice == null || unitPrice.signum() < 0) {
            throw new InvalidOrderItemException("Unit price must be non-negative");
        }

        this.productId = productId;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public BigDecimal subtotal() {
        return unitPrice.multiply(BigDecimal.valueOf(quantity));
    }
}
