package com.phantom.spring_four;

import com.phantom.spring_four.config.ProductRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(ProductRepository.class)
public class SpringFourApplication {
   private final static Logger logger = LogManager.getLogger(SpringFourApplication.class);

    public static void main(String[] args) {
        logger.info("Start");
        SpringApplication.run(SpringFourApplication.class, args);

    }

}
