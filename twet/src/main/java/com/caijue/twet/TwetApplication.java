package com.caijue.twet;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import springfox.documentation.oas.annotations.EnableOpenApi;
@EnableScheduling//开启定时任务
@SpringBootApplication
@MapperScan(basePackages = "com.caijue.twet.mapper")//注解扫描整个mapper文件
@EnableOpenApi//引入swagger的依赖（可在网页上显示方法注解和测试）
//@EnableCaching//开启redis缓存的注解
public class TwetApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwetApplication.class, args);
    }


   /* @Scheduled(cron = "0/2 * * * * ?")
    public void print(){
        System.out.println(Thread.currentThread().getName()+" :spring task run...");
    }*/
}
