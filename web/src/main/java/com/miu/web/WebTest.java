package com.miu.web;

import com.miu.service.ServiceTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
//@Api(value="WebTest",description = "第一次启动测试")
public class WebTest {

    @RequestMapping("showAll")
    //@ApiOperation(value = "model测试")
    public String showAll() {
        ServiceTest serviceTest = new ServiceTest();
        return serviceTest.showService()+":我是web!";
    }

}
