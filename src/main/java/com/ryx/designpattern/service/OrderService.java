package com.ryx.designpattern.service;

import com.ryx.designpattern.service.dto.OrderDTO;
import org.springframework.stereotype.Service;

/**
 * @Description: 订单业务Service
 * @Author: 601704
 * @Date: 2019/6/25 10:33
 */

public interface OrderService {
    /**
     * 方法功能描述:  处理订单业务   if/else  可拓展能力弱 业务处理颗粒度并没有做划分
     *
     * @param:
     * @return:
     * @author: 601704
     * @date: 2019/6/25 10:53
     */
    String handle(OrderDTO dto);

    String handleC(OrderDTO dto);
}
