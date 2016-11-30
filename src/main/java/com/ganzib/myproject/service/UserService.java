package com.ganzib.myproject.service;

/**
 * Created by GanZiB on 16/11/30.
 */
public interface UserService {

    /**
     * 新增一个用户
     * @param name
     * @param age
     */
    void create(String name,Integer age);

    /**
     * 根据用户name删除一个用户
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取用户总量
     * @return
     */
    Integer getAllUsers();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();
}
