package com.JavaAdvancedProgramming.pattern.factory.vehicleFactory;
/**
 * 这是卡车类，继承交通工具类，实现他的move方法
 */
public class Truck extends Vehicle {
    @Override
    public void move() {
        System.out.println("大货车拉货");
    }
}
