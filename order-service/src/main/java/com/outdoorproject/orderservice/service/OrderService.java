package com.outdoorproject.orderservice.service;

import com.outdoorproject.orderservice.dto.requests.OrderLineItemsRequest;
import com.outdoorproject.orderservice.dto.requests.OrderRequest;
import com.outdoorproject.orderservice.model.Order;
import com.outdoorproject.orderservice.model.OrderLineItems;
import com.outdoorproject.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional
public class OrderService {

    private final OrderRepository orderRepository;
    public void placeOrder(OrderRequest orderRequest) {
        Order order = new Order();
        order.setOrderNumber(UUID.randomUUID().toString());

        List<OrderLineItems> orderLineItemsList = orderRequest.getOrderLineItemsResponseList()
                .stream()
                .map(this::mapToDto).toList();
        order.setOrderNumber(orderLineItemsList.toString());

        orderRepository.save(order);
    }

    private OrderLineItems mapToDto(OrderLineItemsRequest orderLineItemsRequest) {
        return OrderLineItems.builder()
                .price(orderLineItemsRequest.getPrice())
                .skuCode(orderLineItemsRequest.getSkuCode())
                .quantity(orderLineItemsRequest.getQuantity())
                .build();
    }
}
