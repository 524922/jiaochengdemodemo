package com.example.demo.user.service;

import com.example.demo.user.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Map;

public interface UserService {
    //获取
    List<UserEntity> getAll(Map map);

    //删除
    void delById(Integer id);

    //保存
    public void save(UserEntity userEntity);

    //根据id查询用户数据
    public UserEntity getUserById(Integer id);

    //根据用户id修改用户信息
    public void updateUserById(@RequestBody  UserEntity userEntity);
}
