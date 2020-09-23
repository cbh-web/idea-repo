package com.hx.shangji.shop.feign;

import com.hx.shangji.shop.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "com-gt-user")
public interface SsoFoergnClient {
      @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public User selectUserById(@PathVariable("id") String id);
}
