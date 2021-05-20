package com.libraryManagementSystem.LibraryManagementSystem.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfiguration {
    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Profile("test")
    @Bean
    public String testDatabaseConnection() {
        System.out.println("DB Connection to RDS_TEST - Low Cost Instance");
        System.out.println(url);
        return "DB Connection to RDS_TEST - Low Cost Instance";
    }

    @Profile("prd")
    @Bean
    public String prodDatabaseConnection() {
        System.out.println("DB Connection to RDS_PROD - High Performance Instance");
        System.out.println(url);
        return "DB Connection to RDS_PROD - High Performance Instance";
    } 
}

