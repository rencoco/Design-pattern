package com.ryx.designpattern.handler;

import com.ryx.designpattern.util.BeanTool;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @Description: HandlerContext
 * @Author: 601704
 * @Date: 2019/6/25 17:52
 */
public class HandlerContext {
    private Map<String, Class> handlerMap;

    public HandlerContext(Map<String, Class> handlerMap) {
        this.handlerMap = handlerMap;
    }

    public AbstractHandler getInstance(String type) {
        Class clazz = handlerMap.get(type);
        if (clazz == null) {
            throw new IllegalArgumentException("not found handler for type:" + type);
        }
        return (AbstractHandler) BeanTool.getBean(clazz);
    }
}
