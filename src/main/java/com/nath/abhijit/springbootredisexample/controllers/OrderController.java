package com.nath.abhijit.springbootredisexample.controllers;

import com.nath.abhijit.springbootredisexample.entity.Order;
import com.nath.abhijit.springbootredisexample.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order save(@RequestBody Order order) {
        return orderService.save(order);
    }

    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order findById(String id) {
        return orderService.findByOrderId(id);
    }

    @DeleteMapping("/{id}")
    public String removeOrderById(int id) {
        return orderService.removeOrderByOrderId(id);
    }

}
