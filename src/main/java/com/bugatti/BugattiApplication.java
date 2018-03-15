package com.bugatti;

import com.bugatti.dataObject.ProductCategory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCaching
public class BugattiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BugattiApplication.class, args);

    }
}
