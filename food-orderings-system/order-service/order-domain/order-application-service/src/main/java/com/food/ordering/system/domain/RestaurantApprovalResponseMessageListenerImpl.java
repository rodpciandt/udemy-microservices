package com.food.ordering.system.domain;

import com.food.ordering.system.domain.dto.message.RestaurantApprovalResponse;
import com.food.ordering.system.domain.ports.input.message.listener.restaurantapproval.RestaurantApprovalResponseMessageListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;


@Slf4j
@Validated
@Service
public class RestaurantApprovalResponseMessageListenerImpl implements RestaurantApprovalResponseMessageListener {

    @Override
    public void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse) {

    }

    @Override
    public void orderRepproved(RestaurantApprovalResponse restaurantApprovalResponse) {

    }
}
