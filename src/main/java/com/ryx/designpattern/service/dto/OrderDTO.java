package com.ryx.designpattern.service.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单实体
 */
@Data
public class OrderDTO implements Serializable {
    private String code;
    private BigDecimal price;
    /**
     * 订单类型
     * 1：普通
     * 2：促销
     * 3：团购
     * ....
     */
    private Integer type;
}
