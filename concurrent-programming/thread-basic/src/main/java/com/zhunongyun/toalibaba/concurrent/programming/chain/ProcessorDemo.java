package com.zhunongyun.toalibaba.concurrent.programming.chain;

/**
 * 请求测试类
 */
public class ProcessorDemo {

    static IRequestProcessor requestProcessor;

    public void setUp() {
        PrintProcessor printProcessor = new PrintProcessor();
        printProcessor.start();

        SaveProcessor saveProcessor = new SaveProcessor(printProcessor);
        saveProcessor.start();

        requestProcessor = new PrevProcessor(saveProcessor);
        ((PrevProcessor) requestProcessor).start();
    }


    public static void main(String[] args) throws InterruptedException {
        ProcessorDemo processorDemo = new ProcessorDemo();
        processorDemo.setUp();

        Request request = new Request();
        request.setName("责任链请求测试");
        requestProcessor.process(request);

        Thread.sleep(2000L);
        System.out.println("2秒后发起新的请求");

        requestProcessor.process(new Request("请求 11"));
    }
}