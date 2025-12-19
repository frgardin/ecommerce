package org.gardin.felipe.ecommerce.infra.persistence.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer", schema = "myschema")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
