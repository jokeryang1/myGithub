package com.atguigu.springcloud.strategy;

import com.atguigu.springcloud.strategy.impl.AliPay;
import com.atguigu.springcloud.strategy.impl.WechatPay;

/**
 * 支付方式
 * @author Y.J.G
 * @version 1.0.0
 * @description
 * @email banana_yang@outlook.com
 * @date 2021/5/6 10:48
 */
public enum PayType {

    PAY_TYPE_A_LI("ali_pay",new AliPay()),
    PAY_TYPE_WECHAT("wechat_pay",new WechatPay()),
    ;
    private  String payType;
    private  PayInterface payInterface;
    PayType(String payType, PayInterface payInterface) {
        this.payType = payType;
        this.payInterface = payInterface;

    }
    public  PayInterface get(){
        return this.payInterface;
    }
    public static PayType getByCode(String payType){
        for (PayType type: PayType.values()){
            if(type.getPayType().equals(payType)){
                return type;
            }
        }
        return null;
    }



    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public PayInterface getPayInterface() {
        return payInterface;
    }

    public void setPayInterface(PayInterface payInterface) {
        this.payInterface = payInterface;
    }
}
