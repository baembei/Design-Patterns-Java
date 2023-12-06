package org.example.Decorator;

public abstract class Beverage {
    protected String description;
    protected double milkCost;
    protected double soyCost;
    protected double mochaCost;
    protected double whipCost;

    public String getDesription(){
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double cost();

    public boolean hasMilk(){
        return true;
    }
    public void setMilk(){

    }
    public boolean hasSoy(){
        return true;
    }
    public void setSoy(){

    }
    public boolean hasMocha(){
        return true;
    }
    public void setMocha(){}
    public boolean hasWhip(){
        return true;
    }
    public void setWhip(){}

    public double getMilkCost() {
        return milkCost;
    }

    public void setMilkCost(double milkCost) {
        this.milkCost = milkCost;
    }

    public double getSoyCost() {
        return soyCost;
    }

    public void setSoyCost(double soyCost) {
        this.soyCost = soyCost;
    }

    public double getMochaCost() {
        return mochaCost;
    }

    public void setMochaCost(double mochaCost) {
        this.mochaCost = mochaCost;
    }

    public double getWhipCost() {
        return whipCost;
    }

    public void setWhipCost(double whipCost) {
        this.whipCost = whipCost;
    }
}
