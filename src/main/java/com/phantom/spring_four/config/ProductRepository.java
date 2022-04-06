package com.phantom.spring_four.config;

import com.phantom.spring_four.model.Product;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("shop.properties")
@Getter
@Setter
@ToString
public class ProductRepository {
    private static final Logger logger = LogManager.getLogger(ProductRepository.class);
    private List<Product> products;
}
