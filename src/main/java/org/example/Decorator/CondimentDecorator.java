package org.example.Decorator;

public abstract class CondimentDecorator extends Beverage{
    Beverage beverage;
    public abstract String getDescription();
}
