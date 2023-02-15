package com.outdoor.orderservice.dto;

import com.outdoor.orderservice.model.OrderItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class OrderRequest {
    private List<OrderItemsDto> orderItemsDto;



}
