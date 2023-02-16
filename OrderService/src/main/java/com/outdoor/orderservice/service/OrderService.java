package com.outdoor.orderservice.service;

import com.outdoor.orderservice.dto.OrderItemsDto;
import com.outdoor.orderservice.dto.OrderRequest;
import com.outdoor.orderservice.model.Order;
import com.outdoor.orderservice.model.OrderItems;
import com.outdoor.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());
       List<OrderItems> orderItems = orderRequest.getOrderItemsDto().stream()
                .map(this::mapToDto)
                .toList();

        order.setOrderItems(orderItems);

        orderRepository.save(order);
    }


    private OrderItems mapToDto(OrderItemsDto orderItemsDto) {
        OrderItems orderItems = new OrderItems();
        orderItems.setPrice(orderItemsDto.getPrice());
        orderItems.setQuantity(orderItemsDto.getQuantity());
        orderItems.setSkuCode(orderItemsDto.getSkuCode());
        return orderItems;
    }


}
