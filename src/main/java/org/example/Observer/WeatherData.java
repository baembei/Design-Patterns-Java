package org.example.Observer;


import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    public float getTemperature(){
        return 0;
    }
    public float getHumidity(){
        return 0;
    }
    public float getPressure(){
        return 0;
    }
    public void measurementsChanged(){
    notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
