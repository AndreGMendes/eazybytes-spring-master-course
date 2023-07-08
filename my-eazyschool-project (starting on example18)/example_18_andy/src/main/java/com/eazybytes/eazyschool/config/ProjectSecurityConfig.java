package com.eazybytes.eazyschool.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfig {

    @Bean
    SecurityFilterChain deSecurityFilterChain(HttpSecurity http) throws Exception{

        /**
        /home
        /holidays
        /contact
        /saveMsg
        /courses
        /about
        */
        http.authorizeHttpRequests()
                .requestMatchers("","/","/home").permitAll()
                .requestMatchers("/holidays/**").permitAll()
                .requestMatchers("/contact").permitAll()
                .requestMatchers("/saveMsg").permitAll()
                .requestMatchers("/courses").permitAll()
                .requestMatchers("/about").permitAll()
                .requestMatchers("/assets/**").permitAll()
                .and().formLogin()
                .and().httpBasic();

        return http.build();


        /*http.authorizeHttpRequests()
                .anyRequest().permitAll() *//**or denyAll()*//*
                .and().formLogin()
                .and().httpBasic();

        return http.build();*/

    }
}
