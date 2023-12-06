package org.example.Decorator;
public class StarbuzzCoffee {
    public static void main(String args[]) {
        //want some Espresso
        Beverage beverage = new Espresso();
        beverage.setSize(Beverage.Size.VENTI);
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());
        //Dark Roast with 2times Mocha and Whip baby
        Beverage beverage2 = new DarkRoast();
        beverage2.setSize(Beverage.Size.VENTI);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
        //House Blend with Soy Mocha and Whip
        Beverage beverage3 = new HouseBlend();
        beverage3.setSize(Beverage.Size.GRANDE);
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}