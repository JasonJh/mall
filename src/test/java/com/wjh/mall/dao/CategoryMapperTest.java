package com.wjh.mall.dao;

import com.wjh.mall.MallApplicationTests;
import com.wjh.mall.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryMapperTest extends MallApplicationTests{

    @Autowired
    private CategoryMapper categoryMapper;

    @Test
    public void findById() throws Exception {
        Category category = categoryMapper.findById(100001);
        System.out.println(category.toString());
    }

    @Test
    public void queryById() throws Exception {
        Category category = categoryMapper.queryById(100001);
        System.out.println(category.toString());
    }

}