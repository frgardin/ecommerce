package org.gardin.felipe.ecommerce.domain.exception;

public abstract class CodeException extends RuntimeException {

    public CodeException(String message) {
        super(message);
    }

    public abstract String getCode();
}
