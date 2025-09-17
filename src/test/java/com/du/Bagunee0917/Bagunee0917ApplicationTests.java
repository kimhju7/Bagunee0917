package com.du.Bagunee0917;

import com.du.Bagunee0917.dao.ProductMapper;
import com.du.Bagunee0917.domain.Product;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

//@SpringBootTest
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//Spring Boot 테스트에서 데이터베이스 설정이 무시되지 않도록 막아주는 설정
class Bagunee0917ApplicationTests {

    @Autowired
    private ProductMapper productMapper;

    @Test
    void contextLoads() {
        List<Product> products = productMapper.findAll();
        for (Product product : products) {
            System.out.println(product);
        }
    }

}
