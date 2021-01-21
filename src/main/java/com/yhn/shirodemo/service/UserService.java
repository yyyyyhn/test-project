package com.yhn.shirodemo.service;

import com.yhn.shirodemo.mapper.UserMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapperExt userMapperExt;

    @Async
    public void add(){
        for(int i = 0;i < 1000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    userMapperExt.add(1);
                }
            }).start();
        }

    }

    @Async
    public void subtract(){
        for(int i = 0;i < 1000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    userMapperExt.subtract(1);
                }
            }).start();
        }

    }
}
