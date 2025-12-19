package org.gardin.felipe.ecommerce.domain.exception;

public class InvalidOrderStateException extends CodeException {

    private static final String CODE = "INVALID_ORDER_STATE";

    public InvalidOrderStateException(String message) {
        super(message);
    }

    @Override
    public String getCode() {
        return CODE;
    }
}
