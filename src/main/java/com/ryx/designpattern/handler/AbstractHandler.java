package com.ryx.designpattern.handler;

import com.ryx.designpattern.service.dto.OrderDTO;

/**
 *
 * @Description: 定义一个抽象类作为所有策略的
 * @Author: 601704
 * @Date: 2019/6/25 10:41
 */

public abstract class AbstractHandler {
    public abstract String handle(OrderDTO dto);
}
