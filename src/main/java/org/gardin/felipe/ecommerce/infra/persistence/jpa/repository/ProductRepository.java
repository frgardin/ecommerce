package org.gardin.felipe.ecommerce.infra.persistence.jpa.repository;

import org.gardin.felipe.ecommerce.infra.persistence.jpa.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
