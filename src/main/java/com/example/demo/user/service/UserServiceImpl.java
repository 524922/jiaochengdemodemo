package com.example.demo.user.service;

import com.example.demo.user.dao.UserDao;
import com.example.demo.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

//获取
    @Override
    public List<UserEntity> getAll(Map map) {
        return userDao.getAll(map);
    }

    //删除
    @Override
    public void delById(Integer id) {
        userDao.delById(id);
    }

    //保存
    @Override
    public void save(UserEntity userEntity) {
        //赋予时间
        System.out.println("service:"+userEntity.toString());
        userEntity.setCreatetime(new Date());
        System.out.println("service:"+userEntity.toString());
        //赋予status
        userEntity.setStatus(1);
        System.out.println("service:"+userEntity.toString());
        userDao.save(userEntity);
    }

    //根据id查询用户信息
    @Override
    public UserEntity getUserById(Integer id) {
        return userDao.getUserById(id);
    }

    @Override
    public void updateUserById(UserEntity userEntity) {
        userDao.updateUserById(userEntity);
    }

}
