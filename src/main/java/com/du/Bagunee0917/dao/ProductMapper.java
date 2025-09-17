package com.du.Bagunee0917.dao;

import com.du.Bagunee0917.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {

    @Select("select * from products")
    List<Product> findAll();

    @Select("select * from products where id = #{id}")
    Product findById(Long id);
}
