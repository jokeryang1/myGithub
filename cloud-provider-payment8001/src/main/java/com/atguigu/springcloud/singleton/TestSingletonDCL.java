package com.atguigu.springcloud.singleton;

/**
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/4/20 9:46
 * 处理并发时候单例问题加锁 双重检查加锁
 */
public class TestSingletonDCL {

    private static TestSingletonDCL singleton = null;
    private String ddk ;
    private TestSingletonDCL() {
    }

    public static TestSingletonDCL getInstance() {

        if (singleton == null) {

            synchronized (TestSingletonDCL.class) {

                if (singleton == null) {

                    singleton = new TestSingletonDCL();
                    singleton.setDdk("二哥测试");
                }
            }
        }
        return singleton;
    }

    public String getDdk() {
        return ddk;
    }

    public void setDdk(String ddk) {
        this.ddk = ddk;
    }
}
