package org.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect // 标识为切面类
@Component // IoC注解：让Spring管理这个Bean
public class LoggingAspect {

    // 前置通知：在OrderService的所有方法执行前记录日志
    @Before("execution(* org.example.service.OrderService.*(..))")
    public void logBefore() {
        System.out.println("[AOP日志] 订单服务方法即将执行...");
    }
}