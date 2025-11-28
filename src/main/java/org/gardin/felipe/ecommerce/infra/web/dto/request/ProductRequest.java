package org.gardin.felipe.ecommerce.infra.web.dto.request;

import java.math.BigDecimal;

public record ProductRequest(String name,
                             String displayName,
                             String description,
                             BigDecimal price,
                             Integer stock){
}
