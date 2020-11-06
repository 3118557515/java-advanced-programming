package com.JavaAdvancedProgramming.pattern.factory.drinksFactory;

public class Beverage_Factory {

    public static Drinks makeDrinks(int type)  {
        if (type==1){
            return new SixWalnuts();
        }else if (type==2){
            return new Sprite();
        }else if (type==3){
            return new WangLaoJi();
        }else {
            return null;
        }
    }
}
