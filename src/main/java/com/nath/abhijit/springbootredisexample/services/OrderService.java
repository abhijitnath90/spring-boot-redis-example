package com.nath.abhijit.springbootredisexample.services;

import com.nath.abhijit.springbootredisexample.entity.Order;

import java.util.List;

public interface OrderService {

    Order save(Order order);

    List<Order> getAllOrders();

    Order findByOrderId(String id);

    String removeOrderByOrderId(int id);
}
