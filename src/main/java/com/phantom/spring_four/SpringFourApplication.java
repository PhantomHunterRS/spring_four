package com.phantom.spring_four;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringFourApplication {
    final static Logger logger = LoggerFactory.getLogger(SpringFourApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringFourApplication.class, args);

    }

}
