package com.nath.abhijit.springbootredisexample.controllers;

import com.nath.abhijit.springbootredisexample.entity.Product;
import com.nath.abhijit.springbootredisexample.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private ProductService productService;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable String id) {
        return productService.findByProductId(id);
    }

    @DeleteMapping("/{id}")
    public String removeProductById(@PathVariable int id) {
        return productService.removeProductByProductId(id);
    }
}
