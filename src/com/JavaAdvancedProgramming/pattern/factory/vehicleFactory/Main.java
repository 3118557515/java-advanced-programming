package com.JavaAdvancedProgramming.pattern.factory.vehicleFactory;

/**
 * 这里是程序入口
 */
public class Main {
    public static void main(String[] args) {
        //调用交通工具工厂类的makeVehicle方法，传入参数，获取对应的实例对象
        Vehicle vehicle1 = Vehicle_Factory.makeVehicle("Truck");
        //调用实例对象的move方法
        vehicle1.move();
        Vehicle vehicle2 = Vehicle_Factory.makeVehicle("Car");
        vehicle2.move();
    }
}
