package com.JavaAdvancedProgramming.pattern.factory.drinksFactory;

public class Sprite implements Drinks {
    @Override
    public void taste() {
        System.out.println("雪碧，透心凉，心飞扬！");
    }
}
