package com.atguigu.springcloud.singleton;

/**
 * 单列模式
 *
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/4/20 9:17
 * 饿汉模式 存在缺陷：资源浪费，不论是否使用，对象都会被创建
 */
public class TestSingletonHungry {
    private  static final TestSingletonHungry singleton = new TestSingletonHungry();

    private TestSingletonHungry() {
    }

    public static TestSingletonHungry getInstance() {
        return singleton;
    }

    public static void main(String[] args) {



    }
    }
