package com.nath.abhijit.springbootredisexample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@RedisHash("Product")
public class Product implements Serializable {

    @Id
    private int id;
    private String name;
    private int quantity;
    private long price;

}
