package org.gardin.felipe.ecommerce.infra.web.controller;

import org.gardin.felipe.ecommerce.application.usecase.ProductCreateUseCase;
import org.gardin.felipe.ecommerce.infra.web.dto.request.ProductRequest;
import org.gardin.felipe.ecommerce.infra.web.dto.response.ProductResponse;
import org.gardin.felipe.ecommerce.infra.web.mapper.ProductDTOMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.gardin.felipe.ecommerce.infra.constant.ResourcePath.PRODUCT_PATH;

@RestController
@RequestMapping(PRODUCT_PATH)
public class ProductController {

    private final ProductDTOMapper productDTOMapper;
    private final ProductCreateUseCase productCreateUseCase;

    public ProductController(ProductDTOMapper productDTOMapper, ProductCreateUseCase productCreateUseCase) {
        this.productDTOMapper = productDTOMapper;
        this.productCreateUseCase = productCreateUseCase;
    }

    @PostMapping
    @Transactional
    public HttpEntity<ProductResponse> create(@RequestBody ProductRequest productRequest) {
        return ResponseEntity.ok(productDTOMapper.toProductResponse(productCreateUseCase.execute(
                productDTOMapper.toProductDomain(productRequest))));
    }
}
