package com.ryx.designpattern.handler.extend;

import com.ryx.designpattern.common.annotation.HandlerType;
import com.ryx.designpattern.handler.AbstractHandler;
import com.ryx.designpattern.service.dto.OrderDTO;
import org.springframework.stereotype.Component;

@Component
@HandlerType("0")
public class NormalHandler extends AbstractHandler {
    @Override
    public String handle(OrderDTO dto) {
        return "普通订单！";
    }
}
