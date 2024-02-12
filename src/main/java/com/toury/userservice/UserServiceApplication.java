package com.toury.userservice;

import com.toury.libcore.config.AppConfig;
import com.toury.libcore.config.MongoDbConfig;
import com.toury.libcore.config.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@Import({
        AppConfig.class,
        SecurityConfig.class,
        MongoDbConfig.class
})
@ComponentScan({"com.toury.*"})
@EnableMongoRepositories
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
