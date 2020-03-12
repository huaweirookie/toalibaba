package com.zhunongyun.toalibaba.designpatterns.prototype.deep;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JinGuBang implements Serializable {

    private float height = 100;

    private float wide = 10;

    public void big() {
        this.height *= 2;
        this.wide *= 2;
    }

    public void small() {
        this.height /= 2;
        this.wide /= 2;
    }
}