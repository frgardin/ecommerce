package org.gardin.felipe.ecommerce.infra.web.mapper;

import org.gardin.felipe.ecommerce.domain.product.Product;
import org.gardin.felipe.ecommerce.infra.web.dto.request.ProductRequest;
import org.gardin.felipe.ecommerce.infra.web.dto.response.ProductResponse;

public interface ProductDTOMapper {

    ProductResponse toProductResponse(Product source);

    Product toProductDomain(ProductRequest source);

    Product toProductDomain(Long id, ProductRequest source);
}
