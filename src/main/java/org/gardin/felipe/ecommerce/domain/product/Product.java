package org.gardin.felipe.ecommerce.domain.product;

import java.math.BigDecimal;
import java.util.Objects;

public class Product {

    private ProductId id;
    private String name;
    private String displayName;
    private String description;
    private int stock;
    private BigDecimal price;

    public Product(String name,
                   String displayName,
                   String description,
                   BigDecimal price,
                   int stock) {
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    public Product(ProductId id,
                   String name,
                   String displayName,
                   String description,
                   BigDecimal price,
                   int stock) {
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.description = description;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return stock == product.stock &&
                Objects.equals(id, product.id) &&
                Objects.equals(name, product.name) &&
                Objects.equals(displayName, product.displayName) &&
                Objects.equals(description, product.description) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, displayName, description, stock, price);
    }

    public ProductId getId() {
        return id;
    }

    public void setId(ProductId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
