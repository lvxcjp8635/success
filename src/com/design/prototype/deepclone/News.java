package com.design.prototype.deepclone;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.util.Date;

public class News implements Serializable {
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

    protected News deepClone(){
        try {
            /**
             * 写入当前对象的二进制流
             */
            ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bao);
            oos.writeObject(this);

            /**
             * 读取二进制流产生的对象
             */
            ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (News) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
