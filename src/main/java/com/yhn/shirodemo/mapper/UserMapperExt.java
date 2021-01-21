package com.yhn.shirodemo.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface UserMapperExt {

    @Update("update user set age = age + 1 where id = #{id} ")
    int add(@Param("id")int id);

    @Update("update user set age = age - 1 where id = #{id} ")
    int subtract(@Param("id")int id);

}
