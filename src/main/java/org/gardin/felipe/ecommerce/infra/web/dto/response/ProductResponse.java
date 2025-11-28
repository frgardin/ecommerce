package org.gardin.felipe.ecommerce.infra.web.dto.response;

import java.math.BigDecimal;

public record ProductResponse(Long id,
                              String name,
                              String displayName,
                              String description,
                              BigDecimal price,
                              Integer stock){
}
