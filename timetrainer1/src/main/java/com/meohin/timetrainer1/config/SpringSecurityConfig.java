package com.meohin.timetrainer1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
public class SpringSecurityConfig {
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeHttpRequests((authorizeHttpRequests) -> {
            authorizeHttpRequests.requestMatchers("/sign/in").permitAll();
            authorizeHttpRequests.requestMatchers("/style.css").permitAll();
            authorizeHttpRequests.anyRequest().authenticated();
        });

        httpSecurity.formLogin((formLogin) -> formLogin.loginPage("/sign/in"));
        httpSecurity.logout((logout) -> logout.logoutRequestMatcher(new AntPathRequestMatcher("/logout")));

        return httpSecurity.build();
    }
}