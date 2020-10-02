package com.example.demo.user.controller;

import com.example.demo.user.entity.UserEntity;


import com.example.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map) {
        return userService.getAll(map);
    }

    @RequestMapping("/delById")
    public String delById(Integer id) {
        userService.delById(id);
        return "redirect:/index.html";//redirect:重新定向，返回index.html
    }

    // 保存用户
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity) {
        System.out.println(userEntity.toString());
        userService.save(userEntity);
        return "success";
    }

    //根据id查询用户信息
    @RequestMapping("/getUserById")
    @ResponseBody
    public UserEntity getUserById(Integer id){
        //调用service层写的接口
        return userService.getUserById(id);
    }

    //根据用户id修改用户信息
    @RequestMapping("/updateUserById")
    @ResponseBody
    public String updateUserById(@RequestBody UserEntity userEntity){
        userService.updateUserById(userEntity);
        return "success";
    }
}
