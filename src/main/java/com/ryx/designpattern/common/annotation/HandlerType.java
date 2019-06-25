package com.ryx.designpattern.common.annotation;

import java.lang.annotation.*;

/**
 * @Description: 自定义注解 @HandlerType
 * @Author: 601704
 * @Date: 2019/6/25 10:47
 */
@Inherited
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface HandlerType {
    String value() default "";
}
