package org.gardin.felipe.ecommerce.infra.web.controller;

import org.gardin.felipe.ecommerce.infra.service.ProductService;
import org.gardin.felipe.ecommerce.infra.web.dto.request.ProductRequest;
import org.gardin.felipe.ecommerce.infra.web.dto.response.ProductResponse;
import org.gardin.felipe.ecommerce.infra.web.mapper.ProductDTOMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

import static org.gardin.felipe.ecommerce.infra.constant.ResourcePath.ID;
import static org.gardin.felipe.ecommerce.infra.constant.ResourcePath.PRODUCT_PATH;

@RestController
@RequestMapping(PRODUCT_PATH)
public class ProductController {

    private final ProductDTOMapper productDTOMapper;
    private final ProductService productService;

    public ProductController(ProductDTOMapper productDTOMapper, ProductService productService) {
        this.productDTOMapper = productDTOMapper;
        this.productService = productService;
    }

    @GetMapping
    public HttpEntity<List<ProductResponse>> getAll() {
        return ResponseEntity.ok(productService.searchAll().stream()
                .map(productDTOMapper::toProductResponse)
                .toList());
    }

    @GetMapping(ID)
    public HttpEntity<ProductResponse> getOne(@PathVariable Long id) {
        return ResponseEntity.ok(productDTOMapper.toProductResponse(productService.searchOne(id)));
    }

    @PostMapping
    public HttpEntity<ProductResponse> create(@RequestBody ProductRequest productRequest) {
        var response = productDTOMapper.toProductResponse(productService.create(productDTOMapper.toProductDomain(productRequest)));
        return ResponseEntity.created(URI.create(PRODUCT_PATH + "/" + response.id())).body(response);
    }

    @PutMapping(ID)
    public HttpEntity<ProductResponse> update(@PathVariable Long id, @RequestBody ProductRequest productRequest) {
        var response = productDTOMapper.toProductResponse(productService.update(productDTOMapper.toProductDomain(id, productRequest)));
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(ID)
    public HttpEntity<?> delete(@PathVariable Long id) {
        productService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
