package com.zhixuejava.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunyard
 * @package com.zhixuejava.cloud
 * @date 2019/12/6 11:11
 * 请给我支付宝打点钱@微信官方
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi serviceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return serviceHi.sayHiFromClient(name);
    }

}
