package com.yhn.shirodemo.controller;

import com.yhn.shirodemo.test.Test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/test")
    public String test(){
        return "test";
    }

}
