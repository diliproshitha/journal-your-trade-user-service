package com.journalyourtrade.journalyourtradeuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JournalYourTradeUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JournalYourTradeUserServiceApplication.class, args);
    }

}
