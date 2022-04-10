package com.phantom.spring_four.controller;


import com.phantom.spring_four.config.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ControllerX {
    private final static Logger logger = LogManager.getLogger(ControllerX.class);
    private final ProductRepository productRepository;

    @GetMapping("/product")
    public String product(Model model){
        model.addAttribute("product",productRepository.getProducts().size());
        return "product";
    }
}
