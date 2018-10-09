package com.enjoy.dp.Prototype.example3;

import org.junit.Test;

/**
 * @Author : Wang Zhen.
 * @Date : Created in 16:08 2018/10/9
 * @Description :
 * @Modified By   :
 * @Version :
 */
public class Example3Test {
    @Test
    public void example3Test() {
        //先创建原型实例
        OrderApi oa1 = new PersonalOrder();

        //设置原型实例的订单数量的值
        oa1.setOrderProductNum(100);
        //为了简单，这里仅仅输出数量
        System.out.println("这是第一次获取的对象实例==="+oa1.getOrderProductNum());

        //通过克隆来获取新的实例
        OrderApi oa2 = (OrderApi)oa1.cloneOrder();
        //修改它的数量
        oa2.setOrderProductNum(80);
        //输出克隆出来的对象的值
        System.out.println("输出克隆出来的实例==="+oa2.getOrderProductNum());

        //再次输出原型实例的值
        System.out.println("再次输出原型实例==="+oa1.getOrderProductNum());
    }
}