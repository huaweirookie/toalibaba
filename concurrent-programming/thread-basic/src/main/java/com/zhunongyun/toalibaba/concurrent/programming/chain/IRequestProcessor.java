package com.zhunongyun.toalibaba.concurrent.programming.chain;

/**
 * 责任链模式的请求处理接口
 */
public interface IRequestProcessor {

    void process(Request request);
}