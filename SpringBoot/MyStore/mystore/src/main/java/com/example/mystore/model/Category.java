package com.example.mystore.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {
    private String id;
    private String name;
    private String burgers;
    private String pizzas;
    private String drinks;
    private String breads;
}
