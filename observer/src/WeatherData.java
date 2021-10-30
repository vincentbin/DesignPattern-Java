import interfaces.Data;
import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject, Data {
    private ArrayList<Observer> observers;
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public WeatherData(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    private void dataChange() {
        this.notifyObservers();
    }

    // getter and setter

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        this.dataChange();
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        this.dataChange();
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        this.dataChange();
    }
}
