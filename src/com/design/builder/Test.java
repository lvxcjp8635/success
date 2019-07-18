package com.design.builder;

public class Test {
    public static void main(String[] args) {
        Director director = new Director();
        Product aProduct = director.getAProduct();
        aProduct.showProduct();

        Product bProduct = director.getBProduct();
        bProduct.showProduct();
    }
}
