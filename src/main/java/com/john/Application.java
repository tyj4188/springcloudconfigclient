/* 
 * 项目名：	com.john
 * 文件名：	Application
 * 模块说明：	
 * 修改历史：
 * 2017/11/9 - ihui - 创建。
 */

package com.john;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ihui
 * @date 2017/11/9
 */

/**
 * 如果要使用这种配置, 必须把配置文件命名为 bootstrap.properties, 不然app.pro会被覆盖一直读默认配置。
 */
@SpringBootApplication
@EnableEurekaClient // 注册
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
