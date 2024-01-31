package com.sociale.app.userinfo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

@SpringBootApplication
@EntityScan({"com.sociale.library.core.model"})
@EnableJpaRepositories({"com.sociale.library.core.repository"})
@EnableEurekaClient
@ComponentScan("com.sociale")
public class SocialeUserInfoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialeUserInfoApplication.class, args);
	}

	@Bean
	public LocaleResolver localeResolver() {

		SessionLocaleResolver localeResolver = new SessionLocaleResolver();

		localeResolver.setDefaultLocale(Locale.ENGLISH);

		return localeResolver;
	}

	@Bean
	public ResourceBundleMessageSource messageSource() {

		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();

		messageSource.setBasename("messages");

		return messageSource;
	}

}
