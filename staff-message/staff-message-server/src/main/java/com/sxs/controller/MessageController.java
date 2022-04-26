package com.sxs.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageController {
    @RequestMapping("/code")
    public String code(){
        return (Math.random()+"").substring(2,6);
    }
}
