package com.design.prototype.clone;

import java.util.Date;

public class News implements Cloneable{
    private String name;
    private Date date;
    private Attach attach;




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Attach getAttach() {
        return attach;
    }

    public void setAttach(Attach attach) {
        this.attach = attach;
    }

    @Override
    protected News clone() throws CloneNotSupportedException {
        return (News)super.clone();
    }
}
