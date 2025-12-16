package org.gardin.felipe.ecommerce.application.usecase;

public interface SearchOneUseCase<T, ID> {

    T execute(ID id);
}
