package org.example.Observer;
//vrode rabotaet no nado dorabotat
public class StatisticsDisplay implements Observer, DisplayElement{
    private float sum=0;
    private int count=0;
    private float avg;
    private float max = Float.MIN_VALUE;
    private float min = Float.MAX_VALUE;
    private float temp;
    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void update() {
        this.temp = weatherData.getTemperature();
        sum += temp;
        count++;

        if (temp > max) {
            max = temp;
        }
        if (temp < min) {
            min = temp;
        }

        avg = sum / count;

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + avg + "/" + max + "/" + min);
    }
}
