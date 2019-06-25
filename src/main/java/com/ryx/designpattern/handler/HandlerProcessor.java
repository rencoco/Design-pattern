package com.ryx.designpattern.handler;

import com.google.common.collect.Maps;
import com.ryx.designpattern.common.annotation.HandlerType;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @Description: 核心功能封装
 * @Author: 601704
 * @Date: 2019/6/25 11:01
 */
@Component
@SuppressWarnings("unchecked")
public class HandlerProcessor implements BeanFactoryPostProcessor  {
    private static final String HANDLER_PACKAGE = "com.ryx.designpattern";

    /**
     * 方法功能描述: 扫描@HandlerType  注解       初始化HandlerContext 并注册到容器里面
     *
     * @param:
     * @return:
     * @author: 601704
     * @date: 2019/6/25 11:04
     */
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        HashMap<String, Class> handlerMap = Maps.newHashMapWithExpectedSize(3);
        ClassScaner.scan(HANDLER_PACKAGE, HandlerType.class).forEach(clazz -> {
            //获取注解中的类型值
            String type = clazz.getAnnotation(HandlerType.class).value();
                handlerMap.put(type,clazz);
        });
        HandlerContext context = new HandlerContext(handlerMap);
        beanFactory.registerSingleton(HandlerContext.class.getName(), context);
    }
}
