package com.JavaAdvancedProgramming.pattern.factory.drinksFactory;

public class Main {
    public static void main(String[] args) {
        Drinks drinks1 = Beverage_Factory.makeDrinks(1);
        drinks1.taste();

        Drinks drinks2 = Beverage_Factory.makeDrinks(2);
        drinks2.taste();

        Drinks drinks3 = Beverage_Factory.makeDrinks(3);
        drinks3.taste();
    }
}
