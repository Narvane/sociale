package com.sociale.app.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableEurekaClient
@EnableZuulProxy
@EntityScan({"com.sociale.library.core.model"})
@EnableJpaRepositories({"com.sociale.library.core.repository"})
@ComponentScan("com.sociale")
public class SocialeGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocialeGatewayApplication.class, args);
    }

}
