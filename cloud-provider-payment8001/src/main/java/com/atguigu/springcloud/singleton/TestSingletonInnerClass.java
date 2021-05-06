package com.atguigu.springcloud.singleton;

/**
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/4/20 9:46
 * 处理并发时候单例问题二 内部类
 */
public class TestSingletonInnerClass {

    private TestSingletonInnerClass() {
    }

    public static TestSingletonInnerClass getInstance() {

        return SingletonBbk.singleton;
    }

    private static class SingletonBbk {
     private static final  TestSingletonInnerClass singleton = new TestSingletonInnerClass();

    }
}
