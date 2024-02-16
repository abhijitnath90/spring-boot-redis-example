package com.nath.abhijit.springbootredisexample.services;

import com.nath.abhijit.springbootredisexample.entity.Product;

import java.util.List;

public interface ProductService {

    Product save(Product product);

    List<Product> getAllProducts();

    Product findByProductId(String id);

    String removeProductByProductId(int id);
}
