package com.springboot.mybatis.controller;


import com.springboot.mybatis.entity.User;
import com.springboot.mybatis.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<User> selectAll(){
        return userService.selectAll();
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public User getOne(@PathVariable("id") long id){
        return userService.getOne(id);
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") long id){
        userService.delete(id);
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public User addUser(@RequestBody User user){
        return userService.insert(user);
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public void update(@RequestBody User user){
        userService.updata(user);
    }

}
