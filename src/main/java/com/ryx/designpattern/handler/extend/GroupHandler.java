package com.ryx.designpattern.handler.extend;

import com.ryx.designpattern.common.annotation.HandlerType;
import com.ryx.designpattern.handler.AbstractHandler;
import com.ryx.designpattern.service.dto.OrderDTO;
import org.springframework.stereotype.Component;

@Component
@HandlerType("2")
public class GroupHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO dto) {
        return "团购订单！";
    }
}
