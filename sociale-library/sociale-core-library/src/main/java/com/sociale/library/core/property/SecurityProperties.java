package com.sociale.library.core.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ConfigurationProperties("sociale.security")
@Getter
@Setter
public class SecurityProperties {

    private String tokenSecretKey;

    private String tokenExpirationTime;

}
