package com.sxs.controller;

import com.sxs.feign.MessageFeign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private MessageFeign messageFeign;

    @RequestMapping("/login")
    public Map<String,Object> login(){
        Map<String,Object> map=new HashMap<>();
        map.put("data","success");
        map.put("code",messageFeign.code());
        return map;
    }
    @RequestMapping("/test")
    public String test(){
        return "user/test";
    }
}
