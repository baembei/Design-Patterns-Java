package org.example.Observer;

public class ForecastDisplay implements Observer, DisplayElement{
    private float currentPressure=29.92f;
    private float lastPressure;
    private WeatherData weatherData;
    public ForecastDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
    lastPressure=currentPressure;
    currentPressure= weatherData.getPressure();
    display();
    }

    @Override
    public void display() {
        System.out.println("ForecastDispplay: Current pressure/Last pressure " + currentPressure + "/" + lastPressure);
    }
}
