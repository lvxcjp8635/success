package com.design.builder;

public class Product {
    private String name;
    private String type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void showProduct(){
        System.out.println(this.name+"--"+this.type);
    }
}
