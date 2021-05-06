package com.atguigu.springcloud.strategy;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/5/6 10:39
 */
@Data
public class Order implements Serializable {
    private static  final long serialVersionUID = -54654654313213L;
    /**
     * 支付方式
     */
    private  String type;
    /**
     * 金额
     */
    private  Integer amount;
    /**
     * 订单编号
     */
    private  String orderNo;
}
