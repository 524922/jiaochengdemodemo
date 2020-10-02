package com.example.demo.user.dao;

import com.example.demo.user.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserDao {
    //获取
    List<UserEntity> getAll(@Param("content")Map map);

    //删除
    void delById(Integer id);

    //保存
    public void save(UserEntity userEntity);

    //根据id查询用户信息
    public UserEntity getUserById(Integer id);

    //根据用户id修改用户信息
    //update 没有返回值，不能使用string 类型定义方法
    public void updateUserById(UserEntity userEntity);
}
