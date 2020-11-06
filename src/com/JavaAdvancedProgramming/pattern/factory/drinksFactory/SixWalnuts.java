package com.JavaAdvancedProgramming.pattern.factory.drinksFactory;

public class SixWalnuts implements Drinks {
    @Override
    public void taste() {
        System.out.println("经常用脑，多喝六个核桃！");
    }
}
