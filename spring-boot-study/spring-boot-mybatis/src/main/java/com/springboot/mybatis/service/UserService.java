package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.User;

import java.util.List;

public interface UserService {
    List<User> selectAll();

    User getOne(long userId);

    void delete(long userId);

    User  insert(User user);

    void updata(User user);
}
