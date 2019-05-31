package com.drp.customer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.drp.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@EnableDubbo
@SpringBootApplication
public class CustomerApplication implements ApplicationRunner {
    @Reference
    private  DataService dataService;

    public static void main(String[] args) {
        SpringApplication.run (CustomerApplication.class, args);
        log.info ("customer is running ..");

    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info ("run");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        log.info (dataService.insertData ("hello"
                ,simpleDateFormat.format (new Date ()),"hello Dubbo and zookeeper").toString ());
        dataService.readData (dataService.insertData ("hi"
                ,simpleDateFormat.format (new Date ()),"hi Dubbo and zookeeper"));
    }
}
