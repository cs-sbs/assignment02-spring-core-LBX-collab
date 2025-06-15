package org.example.service;

import org.example.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // IoC注解：标识为服务层Bean
public class OrderService {

    @Autowired // IoC注解：自动注入依赖
    private OrderDao orderDao;

    public void createOrder() {
        System.out.println("创建订单业务处理");
        orderDao.saveOrder();
    }
}