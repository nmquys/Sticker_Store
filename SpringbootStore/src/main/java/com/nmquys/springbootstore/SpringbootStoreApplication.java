package com.nmquys.springbootstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class SpringbootStoreApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootStoreApplication.class, args);
    }

}
