package org.gardin.felipe.ecommerce.infra.persistence.repository;

import org.gardin.felipe.ecommerce.infra.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
