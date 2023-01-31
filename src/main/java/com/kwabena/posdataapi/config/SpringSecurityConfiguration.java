package com.kwabena.posdataapi.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import com.kwabena.posdataapi.service.MyUserDetailService;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {

@Autowired
MyUserDetailService service;

    //this is for authentication
    @Override
    protected void configure (AuthenticationManagerBuilder auth) throws Exception{
//        auth.inMemoryAuthentication()
//                .withUser("joe")
//                .password("kali")
//                .roles("admin_role", "student_role")
//                .and()
//                .withUser("hello")
//                .password("kali")
//                .roles("student_role");
        auth.userDetailsService(service);
    }

    //this is for authorization
    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.
        httpBasic()
                .and()
        .authorizeRequests()
//        .antMatchers("/products/**").hasAuthority("products")
//        .antMatchers("/receipts/**").hasAnyAuthority("receipts", "products")
        .antMatchers("/**").permitAll()
        .and()
        .formLogin();

    }

    @Bean
    public PasswordEncoder getPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
