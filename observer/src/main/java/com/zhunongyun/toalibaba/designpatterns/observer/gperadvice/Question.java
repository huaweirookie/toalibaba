package com.zhunongyun.toalibaba.designpatterns.observer.gperadvice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {
    private String userName;

    private String content;
}