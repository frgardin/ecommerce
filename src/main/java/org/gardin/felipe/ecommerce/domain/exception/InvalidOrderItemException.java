package org.gardin.felipe.ecommerce.domain.exception;

public class InvalidOrderItemException extends CodeException {

    private static final String CODE = "INVALID_ORDER_ITEM";

    public InvalidOrderItemException(String message) {
        super(message);
    }

    @Override
    public String getCode() {
        return CODE;
    }
}
