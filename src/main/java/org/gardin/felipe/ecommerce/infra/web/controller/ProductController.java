package org.gardin.felipe.ecommerce.infra.web.controller;

import org.gardin.felipe.ecommerce.infra.adapter.*;
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
    private final CreateProductTxAdapter createProductTxAdapter;
    private final DeleteProductTxAdapter deleteProductTxAdapter;
    private final SearchAllProductsTxAdapter searchAllProductsTxAdapter;
    private final SearchOneProductTxAdapter searchOneProductTxAdapter;
    private final UpdateProductTxAdapter updateProductTxAdapter;

    public ProductController(ProductDTOMapper productDTOMapper,
                             CreateProductTxAdapter createProductTxAdapter,
                             DeleteProductTxAdapter deleteProductTxAdapter,
                             SearchAllProductsTxAdapter searchAllProductsTxAdapter,
                             SearchOneProductTxAdapter searchOneProductTxAdapter,
                             UpdateProductTxAdapter updateProductTxAdapter) {
        this.productDTOMapper = productDTOMapper;
        this.createProductTxAdapter = createProductTxAdapter;
        this.deleteProductTxAdapter = deleteProductTxAdapter;
        this.searchAllProductsTxAdapter = searchAllProductsTxAdapter;
        this.searchOneProductTxAdapter = searchOneProductTxAdapter;
        this.updateProductTxAdapter = updateProductTxAdapter;
    }


    @GetMapping
    public HttpEntity<List<ProductResponse>> getAll() {
        return ResponseEntity.ok(searchAllProductsTxAdapter.retrieve().stream()
                .map(productDTOMapper::toProductResponse)
                .toList());
    }

    @GetMapping(ID)
    public HttpEntity<ProductResponse> getOne(@PathVariable Long id) {
        return ResponseEntity.ok(productDTOMapper.toProductResponse(searchOneProductTxAdapter.retrieve(id)));
    }

    @PostMapping
    public HttpEntity<ProductResponse> create(@RequestBody ProductRequest productRequest) {
        var response = productDTOMapper.toProductResponse(createProductTxAdapter.execute(productDTOMapper.toProductDomain(productRequest)));
        return ResponseEntity.created(URI.create(PRODUCT_PATH + "/" + response.id())).body(response);
    }

    @PutMapping(ID)
    public HttpEntity<ProductResponse> update(@PathVariable Long id, @RequestBody ProductRequest productRequest) {
        var response = productDTOMapper.toProductResponse(updateProductTxAdapter.execute(productDTOMapper.toProductDomain(id, productRequest)));
        return ResponseEntity.ok(response);
    }

    @DeleteMapping(ID)
    public HttpEntity<?> delete(@PathVariable Long id) {
        deleteProductTxAdapter.execute(id);
        return ResponseEntity.noContent().build();
    }
}
