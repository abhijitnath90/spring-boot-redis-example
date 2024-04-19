package com.nath.abhijit.springbootredisexample.redis.repository;

import com.nath.abhijit.springbootredisexample.entity.Order;
import com.nath.abhijit.springbootredisexample.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderDao {

    public static final String ORDER_HASH_KEY = "ORDER";

    @Autowired
    private RedisTemplate redisTemplate;

    public Order save(Order order) {
        redisTemplate.opsForValue().set(String.valueOf(order.getId()), order);
        return order;
    }

    public List findAll() {
        return redisTemplate.opsForHash().values(ORDER_HASH_KEY);
    }

    public Order findOrderById(int id) {
        return (Order) redisTemplate.opsForValue().get(String.valueOf(id));
    }

    public String deleteOrder(int id) {
        redisTemplate.opsForHash().delete(ORDER_HASH_KEY, id);
        return "order removed";
    }

}
