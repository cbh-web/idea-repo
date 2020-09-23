package com.hx.shangji.shop.controller;

import com.hx.shangji.shop.entity.User;
import com.hx.shangji.shop.feign.SsoFoergnClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/shop")
public class UserController {
  /*  @Autowired
    private RestTemplate restTemplate;*/
//sdad
    @Autowired
    private SsoFoergnClient ssoFoergnClient;
   /* @RequestMapping("/{id}")
    public Object selectUserById(@PathVariable String id){
        String userURL="http://com-gt-user/user/"+id;
        User user=restTemplate.getForObject(userURL, User.class);
        return user;
    }*/
    @RequestMapping("/{id}")
    public Object selectUserById(@PathVariable String id){
        //ip及端口换为目标服务名称
        //String userURL ="http://com-gt-user/user/"+id;
        //上边已拼装url,如果是？号后边带的参数，可以getForObject带参数的方法
        User user = ssoFoergnClient.selectUserById("user/"+id);
        return  user;
    }
}
