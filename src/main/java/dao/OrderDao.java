package org.example.dao;

import org.springframework.stereotype.Repository;

@Repository // IoC注解：标识为持久层Bean
public class OrderDao {
    public void saveOrder() {
        System.out.println("订单已保存到数据库");
    }
}
