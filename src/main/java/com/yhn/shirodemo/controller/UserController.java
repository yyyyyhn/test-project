package com.yhn.shirodemo.controller;

import com.yhn.shirodemo.mapper.UserMapper;
import com.yhn.shirodemo.mapper.UserMapperExt;
import com.yhn.shirodemo.service.UserService;
import com.yhn.shirodemo.test.Test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserMapperExt userMapperExt;
    @Autowired
    private UserService userService;

    @GetMapping("/test2")
    public String test2(){
        return userMapper.selectByPrimaryKey(1).toString();
    }

    @GetMapping("/test")
    public String test(){
        userMapperExt.add(1);
        return "test";
    }

    @GetMapping("/test3")
    public String test3(){
        userService.add();
        userService.subtract();
        return "success";
    }

}
