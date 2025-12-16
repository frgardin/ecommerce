package org.gardin.felipe.ecommerce.application.usecase;

import java.util.List;

public interface SearchAllUseCase<T> {

    List<T> execute();
}
