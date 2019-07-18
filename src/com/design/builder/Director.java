package com.design.builder;

public class Director {
    private Builder builder = new FirstBuilder();
    public Product getAProduct(){
        builder.setPart("宝马","汽车");
        return builder.getProduct();
    }

    public Product getBProduct(){
        builder.setPart("膜拜","单车");
        return builder.getProduct();
    }
}
