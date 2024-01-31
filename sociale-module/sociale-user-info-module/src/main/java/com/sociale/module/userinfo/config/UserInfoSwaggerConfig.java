package com.sociale.module.userinfo.config;


import com.sociale.library.core.config.BaseSwaggerConfig;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class UserInfoSwaggerConfig extends BaseSwaggerConfig {

    private static final String TITLE = "Sociale User Info";
    private static final String DESCRIPTION = "Sociale micro-service for user information";
    private static final String BASE_PACKAGE = "com.sociale";

    public UserInfoSwaggerConfig() {
        super(BASE_PACKAGE, TITLE, DESCRIPTION);
    }

}
