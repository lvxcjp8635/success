package com.design.builder;

public abstract class Builder {
    public abstract void setPart(String name, String type);

    public abstract Product getProduct();
}
