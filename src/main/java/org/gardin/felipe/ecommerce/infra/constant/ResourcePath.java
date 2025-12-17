package org.gardin.felipe.ecommerce.infra.constant;

public final class ResourcePath {

    private static final String API_PATH = "/api";

    public static final String PRODUCT_PATH = API_PATH + "/products";

    public static final String ID = "/{id}";

    private ResourcePath() {
        throw new IllegalArgumentException();
    }
}
