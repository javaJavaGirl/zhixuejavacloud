package com.zhixuejava.cloud;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author sunyard
 * @package com.zhixuejava.cloud
 * @date 2019/12/6 14:36
 * 请给我支付宝打点钱@微信官方
 */

@Component
public class SchedualServiceHiErrorService implements SchedualServiceHi {
    @Override
    public String sayHiFromClient(String name) {
        return "我是声明式服务Feign,我叫"+name+",特么的我也坏了";
    }
}
