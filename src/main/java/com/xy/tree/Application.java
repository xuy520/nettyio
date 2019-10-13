package com.xy.tree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * springboot 已经启动内嵌的是tomcat 默认的端口是8080
 *
 * @author xuyue
 */
//@SpringBootApplication相当于@Configuration、@EnableAutoConfiguration和  @ComponentScan
@SpringBootApplication
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}