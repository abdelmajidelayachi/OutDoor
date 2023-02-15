package com.outdoor.orderservice.controller;

import com.outdoor.orderservice.dto.OrderRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
public class OrderController {

    @PostMapping
    public String placeOrder(@RequestBody OrderRequest orderRequest){
        return "Order Placed";
    }
}
