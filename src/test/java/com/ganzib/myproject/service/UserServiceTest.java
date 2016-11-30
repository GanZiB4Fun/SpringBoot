package com.ganzib.myproject.service;

import com.ganzib.myproject.Application;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * Created by GanZiB on 16/11/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
@WebAppConfiguration
public class UserServiceTest {

    @Autowired
    private UserService userService;

    /**
     * 准备，清空数据库
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        userService.deleteAllUsers();
    }

    @Test
    public void create() throws Exception {
        // 插入5个用户
        userService.create("a", 1);
        userService.create("b", 2);
        userService.create("c", 3);
        userService.create("d", 4);
        userService.create("e", 5);
        // 查数据库，应该有5个用户
        Assert.assertEquals(5, userService.getAllUsers().intValue());
        // 删除两个用户
        userService.deleteByName("a");
        userService.deleteByName("e");
        // 查数据库，应该有3个用户
        Assert.assertEquals(3, userService.getAllUsers().intValue());
    }

    @Test
    public void deleteByName() throws Exception {

    }

}