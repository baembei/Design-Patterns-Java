package org.example.Decorator;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDesription(){
        return description;
    }

    public abstract double cost();

}
