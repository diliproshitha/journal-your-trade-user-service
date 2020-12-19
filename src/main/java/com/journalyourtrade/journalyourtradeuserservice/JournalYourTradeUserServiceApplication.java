package com.journalyourtrade.journalyourtradeuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
@EnableJpaRepositories
@EnableEurekaClient
public class JournalYourTradeUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JournalYourTradeUserServiceApplication.class, args);
    }

}
