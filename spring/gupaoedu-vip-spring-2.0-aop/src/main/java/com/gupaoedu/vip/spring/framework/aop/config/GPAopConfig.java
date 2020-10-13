package com.gupaoedu.vip.spring.framework.aop.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Tom.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GPAopConfig {
    
    private String pointCut;
    private String aspectClass;
    private String aspectBefore;
    private String aspectAfter;
    private String aspectAfterThrow;
    private String aspectAfterThrowingName;
}