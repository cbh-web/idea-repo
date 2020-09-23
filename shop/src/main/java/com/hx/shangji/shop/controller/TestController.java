package com.hx.shangji.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("show")
    public void show(){
        System.out.println("show idea");
    }
}
