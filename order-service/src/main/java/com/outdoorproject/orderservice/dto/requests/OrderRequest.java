package com.outdoorproject.orderservice.dto.requests;

import com.outdoorproject.orderservice.dto.responses.OrderLineItemsResponse;
import com.outdoorproject.orderservice.model.OrderLineItems;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {

    private List<OrderLineItemsRequest> orderLineItemsResponseList;

}
