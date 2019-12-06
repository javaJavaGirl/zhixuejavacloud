package com.zhixuejava.cloud;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author sunyard
 * @package com.zhixuejava.cloud
 * @date 2019/12/6 11:00
 * 请给我支付宝打点钱@微信官方
 */
@FeignClient(value = "iamclient")
public interface SchedualServiceHi {

        @RequestMapping(value = "/hi",method = RequestMethod.GET)
        String sayHiFromClient(@RequestParam("name") String name);

}
