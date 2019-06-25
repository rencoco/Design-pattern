package com.ryx.designpattern.service.impl;

import com.ryx.designpattern.handler.AbstractHandler;
import com.ryx.designpattern.handler.HandlerContext;
import com.ryx.designpattern.service.OrderService;
import com.ryx.designpattern.service.dto.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author: 601704
 * @Date: 2019/6/25 18:51
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private HandlerContext handlerContext;

    @Override
    public String handle(OrderDTO dto) {
        if (dto.getType() == 0) {
            System.out.println("----------普通");
        }

        if (dto.getType() == 1) {
            System.out.println("----------促销");
        }

        if (dto.getType() == 2) {
            System.out.println("----------团购");
        }
        return "OK";
    }

    @Override
    public String handleC(OrderDTO dto) {
        try {
            AbstractHandler instance = handlerContext.getInstance(String.valueOf(dto.getType()));
            return instance.handle(dto);
        } catch (IllegalArgumentException e) {
            return "请求类型错误！";
        }
    }
}
