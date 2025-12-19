package org.gardin.felipe.ecommerce.domain.order;

import org.gardin.felipe.ecommerce.domain.customer.CustomerId;
import org.gardin.felipe.ecommerce.domain.exception.EmptyOrderException;
import org.gardin.felipe.ecommerce.domain.exception.InvalidOrderStateException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private final OrderId id;
    private final CustomerId customerId;
    private OrderStatus status;
    private final List<OrderItem> items;

    public Order(OrderId id, CustomerId customerId, List<OrderItem> items) {
        if (items == null || items.isEmpty()) {
            throw new EmptyOrderException();
        }
        this.id = id;
        this.customerId = customerId;
        this.items = new ArrayList<>(items);
        this.status = OrderStatus.CREATED;
    }

    public BigDecimal total() {
        return items.stream()
                .map(OrderItem::subtotal)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public void addItem(OrderItem item) {
        ensureModifiable();
        items.add(item);
    }

    public void cancel() {
        ensureModifiable();
        this.status = OrderStatus.CANCELLED;
    }

    public void markAsPaid() {
        ensureModifiable();
        this.status = OrderStatus.PAID;
    }

    public OrderId getId() {
        return id;
    }

    public CustomerId getCustomerId() {
        return customerId;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    private void ensureModifiable() {
        if (status != OrderStatus.CREATED) {
            throw new InvalidOrderStateException(
                    "Order cannot be modified when status is " + status
            );
        }
    }
}
