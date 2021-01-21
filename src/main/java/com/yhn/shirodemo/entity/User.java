package com.yhn.shirodemo.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class User implements Serializable {
    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private String phone;

    private String address;

    private static final long serialVersionUID = 1L;
}