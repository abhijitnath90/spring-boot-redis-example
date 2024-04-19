package com.nath.abhijit.springbootredisexample.services.impl;

import com.nath.abhijit.springbootredisexample.entity.Order;
import com.nath.abhijit.springbootredisexample.redis.repository.OrderDao;
import com.nath.abhijit.springbootredisexample.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService  {

    @Autowired
    private OrderDao orderDao;
    @Override
    public Order save(Order order) {
        return orderDao.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderDao.findAll();
    }

    @Override
    @Cacheable(cacheNames = "OrderRegion", key = "#key")
    public Order findByOrderId(String id) {
        return orderDao.findOrderById(Integer.parseInt(id));
    }

    @Override
    @CacheEvict(value = "OrderRegion", key = "#key")
    public String removeOrderByOrderId(int id) {
        return orderDao.deleteOrder(id);
    }

}
