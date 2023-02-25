package com.outdoorproject.productservice.dto.requests;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductRequest {
    private String name;
    private String description;
    private BigDecimal price;

}
