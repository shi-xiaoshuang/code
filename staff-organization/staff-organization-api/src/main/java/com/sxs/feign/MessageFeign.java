package com.sxs.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("staff-message")
public interface MessageFeign {
    @RequestMapping("/message/code")
    String code();

}
