package com.phantom.spring_four.model;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
public class Product {
    private Integer id;
    private String title;
    private Double cost;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return id.equals(product.id);
    }
}
