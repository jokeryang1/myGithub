package com.atguigu.springcloud.singleton;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/4/20 10:36
 */
public class TestThreadPoolExecutor {


    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(0,50,1, TimeUnit.SECONDS,new SynchronousQueue<>());
//        for(int i = 0; i < 100; i++){
            poolExecutor.execute(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                    TestSingletonHungry instance = TestSingletonHungry.getInstance();
//                    TestSingletonLazy instance = TestSingletonLazy.getInstance();
//                    TestSingletonSynchronized instance = TestSingletonSynchronized.getInstance();
//                    TestSingletonDCL instance = TestSingletonDCL.getInstance();
                TestSingletonInnerClass instance = TestSingletonInnerClass.getInstance();
                System.out.println(instance.toString() );
            });
//        }
    }
}
