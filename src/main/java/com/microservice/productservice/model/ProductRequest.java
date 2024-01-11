package com.microservice.productservice.model;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductRequest {
    private String name;
    private long price;
    private long quantity;
}
