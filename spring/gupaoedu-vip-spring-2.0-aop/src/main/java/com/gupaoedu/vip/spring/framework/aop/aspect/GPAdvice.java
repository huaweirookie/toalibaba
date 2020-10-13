package com.gupaoedu.vip.spring.framework.aop.aspect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Method;

/**
 * Created by Tom.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GPAdvice {
    private Object aspect;
    private Method adviceMethod;
    private String throwName;

    public GPAdvice(Object aspect, Method adviceMethod) {
        this.aspect = aspect;
        this.adviceMethod = adviceMethod;
    }
}