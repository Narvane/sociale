package com.sociale.library.security.config;

import com.sociale.library.security.filter.JwtFilter;
import com.sociale.library.security.service.impl.CustomUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.BeanIds;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;

import static com.sociale.library.core.constants.EndpointPathsConstants.*;
import static com.sociale.library.core.enumeration.RoleEnum.ATHLETE;
import static com.sociale.library.core.enumeration.RoleEnum.TEAM;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    private CustomUserDetailsService customUserDetailsService;

    private JwtFilter jwtFilter;

    public SecurityConfig() {}

    @Autowired public SecurityConfig(@Qualifier("customUserDetailsService") CustomUserDetailsService customUserDetailsService,
                                     JwtFilter jwtFilter) {

        this.customUserDetailsService = customUserDetailsService;
        this.jwtFilter = jwtFilter;

    }

    @Bean(name = BeanIds.AUTHENTICATION_MANAGER)
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(customUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.cors().configurationSource(request -> new CorsConfiguration().applyPermitDefaultValues())
                .and().csrf().disable()
                .authorizeRequests()
                .antMatchers(AUTHENTICATE_PATH).permitAll()
                .antMatchers(SWAGGER_PATHS).permitAll()
                .antMatchers(PUBLIC_PATH).permitAll()
                .antMatchers(ATHLETE_ALL_PATH).hasRole(ATHLETE.getName())
                .antMatchers(TEAM_ALL_PATH).hasRole(TEAM.getName())
                .anyRequest().authenticated()
                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        //TODO Provavelmente não vai funcionar
        http.addFilterAfter(jwtFilter, UsernamePasswordAuthenticationFilter.class);

    }

}
