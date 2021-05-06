package com.atguigu.springcloud.strategy;

/**
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/5/6 10:42
 */
public interface PayInterface {
    /**
     * 支付
     * @param order
     */
    public void  pay(Order order);
}
