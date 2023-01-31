package com.kwabena.posdataapi.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class User implements UserDetails {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String password;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isIsactive() {
        return isactive;
    }
//
//    public void setIsactive(boolean isactive) {
//        this.isactive = isactive;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", isactive=" + isactive +
                ", authorities='" + authorities + '\'' +
                '}';
    }

    public User() {
    }

    public User(String password, String username, boolean isactive, String authorities) {
        this.password = password;
        this.username = username;
        this.isactive = isactive;
        this.authorities = authorities;
    }
//    }

//    public void setAuthorities(String authorities) {
//        this.authorities = authorities;
//    }

    boolean isactive;
    private String authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authority_list = new ArrayList<>();

        String[]auth_array = this.authorities.split(":");
        for (int i=0; i<auth_array.length; i++){
                GrantedAuthority obj = new SimpleGrantedAuthority(auth_array[i]);
                authority_list.add(obj);

        }
        return authority_list;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.isactive;
    }
}
