package com.JavaAdvancedProgramming.pattern.factory.drinksFactory;

public class WangLaoJi implements Drinks {
    @Override
    public void taste() {
        System.out.println("怕上火，喝王老吉！");
    }
}
