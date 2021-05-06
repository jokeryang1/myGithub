package com.atguigu.springcloud.strategy.impl;

import com.atguigu.springcloud.strategy.Order;
import com.atguigu.springcloud.strategy.PayInterface;

/**
 * 支付宝支付
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/5/6 10:44
 */
public class AliPay implements PayInterface {

    @Override
    public void pay(Order order) {
        System.out.println("支付金额：" + order.getAmount());
        System.out.println("支付方式：" + order.getType());
    }
}
