package org.example;

import org.example.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        // 1. 初始化Spring容器(IoC容器)
        var context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 2. 从容器获取Bean
        OrderService orderService = context.getBean(OrderService.class);

        // 3. 测试IoC和AOP
        System.out.println("----- 测试开始 -----");
        orderService.createOrder();
        System.out.println("----- 测试结束 -----");

        context.close();
    }
}
