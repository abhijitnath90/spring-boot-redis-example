package com.nath.abhijit.springbootredisexample.services.impl;

import com.nath.abhijit.springbootredisexample.entity.Product;
import com.nath.abhijit.springbootredisexample.redis.repository.ProductDao;
import com.nath.abhijit.springbootredisexample.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product save(Product product) {
        return productDao.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productDao.findAll();
    }

    @Override
    public Product findByProductId(String id) {
        return productDao.findProductById(Integer.parseInt(id));
    }

    @Override
    public String removeProductByProductId(int id) {
        return productDao.deleteProduct(id);
    }

}
