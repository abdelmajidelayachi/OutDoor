package com.outdoor.orderservice.service;

import com.outdoor.orderservice.dto.OrderItemsDto;
import com.outdoor.orderservice.dto.OrderRequest;
import com.outdoor.orderservice.model.Order;
import com.outdoor.orderservice.model.OrderItems;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {
    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
        orderRequest.getOrderItemsDto().stream()
                .map(this::mapToDto)
                .toList();
    }

    private OrderItems mapToDto(OrderItemsDto orderItemsDto) {
        OrderItems orderItems = new OrderItems();
        orderItems.setPrice(orderItemsDto.getPrice());
        orderItems.setQuantity(orderItemsDto.getQuantity());
        orderItems.setSkuCode(orderItemsDto.getSkuCode());
        return orderItems;
    }

}
