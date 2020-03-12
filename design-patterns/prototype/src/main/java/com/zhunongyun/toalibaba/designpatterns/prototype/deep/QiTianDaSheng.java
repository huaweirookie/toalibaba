package com.zhunongyun.toalibaba.designpatterns.prototype.deep;

import lombok.Data;
import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.Date;

@Data
public class QiTianDaSheng implements Cloneable, Serializable {

    private JinGuBang jinGuBang;

    private int height;

    private int weight;

    private Date birthday;

    public QiTianDaSheng() {
        this.birthday = new Date();
        this.jinGuBang = new JinGuBang();
    }

    @Override
    protected Object clone() {
        return this.deepClone();
    }

    public Object deepClone() {
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;

        // 内存中完成操作,对象读写,是通过字节码直接操作
        // 序列化操作类似
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);

            // 完整的新的对象, new出来一个新的对象
            QiTianDaSheng copy = (QiTianDaSheng) objectInputStream.readObject();
            copy.setBirthday(new Date());

            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            IOUtils.closeQuietly(objectInputStream);
            IOUtils.closeQuietly(byteArrayInputStream);
            IOUtils.closeQuietly(objectOutputStream);
            IOUtils.closeQuietly(byteArrayOutputStream);
        }
    }
}