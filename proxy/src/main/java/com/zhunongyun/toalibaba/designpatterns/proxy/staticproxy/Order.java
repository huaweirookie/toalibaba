package com.zhunongyun.toalibaba.designpatterns.proxy.staticproxy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Object orderInfo;
    private Long createTime;
    private String id;
}