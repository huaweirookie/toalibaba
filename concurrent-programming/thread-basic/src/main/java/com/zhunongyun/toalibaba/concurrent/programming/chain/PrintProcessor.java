package com.zhunongyun.toalibaba.concurrent.programming.chain;

import java.util.concurrent.LinkedBlockingQueue;


public class PrintProcessor extends Thread implements IRequestProcessor {
    //阻塞队列
    LinkedBlockingQueue<Request> requests = new LinkedBlockingQueue<>();

    private IRequestProcessor nextProcessor;

    private volatile boolean isFinish = false;

    public PrintProcessor() {
    }

    public PrintProcessor(IRequestProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    /**
     * 对外提供关闭的方法
     */
    public void shutdown() {
        isFinish = true;
    }

    @Override

    public void run() {
        //不建议这么写
        while (!isFinish) {
            try {
                //阻塞式获取数据
                //消费者
                Request request = requests.take();
                //真正的处理逻辑
                System.out.println("PrintProcessor:" + request);
                //交给下一个责任链
                if (nextProcessor != null) {
                    nextProcessor.process(request);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void process(Request request) {
        //TODO 根据实际需求去做一些处理
        requests.add(request); //生产者
    }
}