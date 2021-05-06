package com.atguigu.springcloud.singleton;

/**
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/4/20 9:46
 * 处理并发时候单例问题加锁  缺点：性能差
 */
public class TestSingletonSynchronized {

    private static TestSingletonSynchronized singleton = null;

    private TestSingletonSynchronized() {
    }

    public static TestSingletonSynchronized getInstance() {
        synchronized (TestSingletonSynchronized.class) {
            if (singleton == null) {
                singleton = new TestSingletonSynchronized();
                return singleton;
            }
        }
        return singleton;
    }

}
