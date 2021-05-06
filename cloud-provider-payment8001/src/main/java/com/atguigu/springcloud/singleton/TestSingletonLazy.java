package com.atguigu.springcloud.singleton;

/**
 * 单例模式，在一个系统内一个类只有一个对象实例
 * 常用场景 日志管理 打印 数据库连接池等
 *
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/4/20 9:37
 * 懒汉模式  存在问题：多线程可能创建多个对象
 */
public class TestSingletonLazy {
    private volatile static TestSingletonLazy singleton = null;

    private TestSingletonLazy() {
    }

    public static TestSingletonLazy getInstance() {
        singleton = new TestSingletonLazy();
        return singleton;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getInstance());
        }
    }
}
