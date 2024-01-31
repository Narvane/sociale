package com.sociale.app.auth;

import com.sociale.library.core.property.SecurityProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"com.sociale.library.core.model"})
@EnableJpaRepositories({"com.sociale.library.core.repository"})
@EnableConfigurationProperties(value = SecurityProperties.class)
@EnableEurekaClient
@ComponentScan({"com.sociale.library.core", "com.sociale.library.security"})
public class SocialeAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialeAuthApplication.class, args);
    }

}
