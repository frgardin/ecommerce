package org.gardin.felipe.ecommerce.domain.exception;

public class EmptyOrderException extends CodeException {

    private static final String MESSAGE = "An order must have items.";
    private static final String CODE = "EMPTY_ORDER";

    public EmptyOrderException() {
        super(MESSAGE);
    }

    @Override
    public String getCode() {
        return CODE;
    }
}
