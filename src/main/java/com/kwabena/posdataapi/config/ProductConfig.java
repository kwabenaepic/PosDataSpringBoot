//package com.kwabena.posdataapi.config;
//
//
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//@EnableWebSecurity
//public class ProductConfig extends WebSecurityConfigurerAdapter {
//
//    protected void configure (AuthenticationManagerBuilder auth) throws Exception{
//        auth.inMemoryAuthentication()
//                .withUser("user")
//                .password("kali")
//                .roles("admin_role", "student_role")
//                .and()
//                .withUser("user1")
//                .password("kali")
//                .roles("my_role");
//    }
//}
