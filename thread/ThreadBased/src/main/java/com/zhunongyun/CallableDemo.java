package com.zhunongyun;

import java.util.concurrent.*;

public class CallableDemo implements Callable<String> {
    /**
     * Computes a result, or throws an exception if unable to do so.
     *
     * @return computed result
     * @throws Exception if unable to compute a result
     */
    @Override
    public String call() throws Exception {
        int a = 2;

        int b = 2;

        System.out.println(a + b);
        return "执行结果" + (a + b);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        CallableDemo callableDemo = new CallableDemo();

        Future<String> future = executorService.submit(callableDemo);

        System.out.println(future.get());
        executorService.shutdown();
    }
}