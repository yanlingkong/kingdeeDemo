/**
 * Copyright:   www.batsoft.cn
 *
 * @author: Yuan Zhicheng
 * @version: V1.0
 * @Date: 2016年12月10日 下午3:01:08
 */
package com.kingdee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Yuan Zhicheng
 * @Date :          2016年12月10日 下午3:01:08
 */
@SpringBootApplication(scanBasePackages = {"com.kingdee"})
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }
}