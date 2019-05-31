package com.drp.serve;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@Slf4j
@EnableDubbo
@SpringBootApplication
public class ServeApplication {

    public static void main(String[] args) {
        SpringApplication.run (ServeApplication.class, args);
        log.info ("serve is running ..");
    }

}
