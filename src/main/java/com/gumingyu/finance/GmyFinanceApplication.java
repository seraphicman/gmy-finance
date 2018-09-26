package com.gumingyu.finance;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 程序入口
 */
@SpringBootApplication
@Slf4j
public class GmyFinanceApplication {

    /**
     * @param args main函数参数
     */
    public static void main(String[] args) {
        SpringApplication.run(GmyFinanceApplication.class, args);
    }
}
