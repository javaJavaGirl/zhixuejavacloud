package com.zhixuejava.cloud;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorMethod")
    public String hiService(String name) {
        return restTemplate.getForObject("http://IAMCLIENT/hi?name="+name,String.class);
    }


    public String errorMethod(String name) {
        return "我特么的坏了,"+name;
    }

}