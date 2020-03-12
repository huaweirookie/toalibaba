package com.zhunongyun.toalibaba.designpatterns.prototype.simelp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConcretePrototypeA implements Prototype {
    /**
     * 年龄
     */
    private int age;

    /**
     * 姓名
     */
    private String name;

    /**
     * 兴趣爱好
     */
    private List hobbies;


    @Override
    public Prototype clone() {
        return new ConcretePrototypeA(this.age, this.name, this.hobbies);
    }
}