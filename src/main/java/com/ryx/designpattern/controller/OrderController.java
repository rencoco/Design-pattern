package com.ryx.designpattern.controller;

import com.ryx.designpattern.service.OrderService;
import com.ryx.designpattern.service.dto.OrderDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "订单服务", description = "订单服务")
public class OrderController {
    @Autowired
    protected OrderService orderService;

    @GetMapping("/order/{type}")
    @ApiOperation("处理订单--策略模式")
    public String handlerOrder(@PathVariable String type) {
        OrderDTO dto = new OrderDTO();
        dto.setType(Integer.valueOf(type));
        return orderService.handleC(dto);
    }
}
