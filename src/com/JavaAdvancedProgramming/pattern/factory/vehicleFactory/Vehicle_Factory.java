package com.JavaAdvancedProgramming.pattern.factory.vehicleFactory;

/**
 * 这是交通工具工厂类,用户调用makeVehicle方法,并传参数,根据参数返回相对应的实例给调用者
 */
public class Vehicle_Factory {
    public static Vehicle makeVehicle(String vehicleType){
        if (vehicleType.equals("Car")){
            return new Car();
        }else if(vehicleType.equals("Truck")){
            return new Truck();
        }else {
            return null;
        }
    }
}
