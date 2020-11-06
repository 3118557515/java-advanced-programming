package com.JavaAdvancedProgramming.pattern.factory.vehicleFactory;

/**
 * 这是小汽车类，继承交通工具类，实现他的move方法
 */
public class Car extends Vehicle {

    @Override
    public void move() {
        System.out.println("小汽车载人");
    }
}
