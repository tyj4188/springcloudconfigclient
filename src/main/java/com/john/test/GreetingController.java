/* 
 * 项目名：	com.john.test
 * 文件名：	GreetingController
 * 模块说明：	
 * 修改历史：
 * 2017/11/9 - ihui - 创建。
 */

package com.john.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ihui
 * @date 2017/11/9
 */
@RestController
public class GreetingController {
    @Value("${foo}")
    private String foo;

    /**
     * 获取配置文件的值
     * @return
     */
    @RequestMapping("/greeting")
    public String greeting() {
        return foo;
    }
}
