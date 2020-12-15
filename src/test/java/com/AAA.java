package com;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AAA {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("slivki", "milk"),
                new Product("iogurt", "milk"),
                new Product("smetana", "milk"),
                new Product("baton", "bread"),
                new Product("toast", "bread"),
                new Product("bulka", "bread")
        );

        List<Product> milkProducts = products.stream().filter(p -> "milk".equals(p.getCategory())).collect(Collectors.toList());
        System.out.println(milkProducts);
        System.out.println(products);
    }



    @Data
    @AllArgsConstructor
    public static class Product{

        String name;
        String category;

    }

}
