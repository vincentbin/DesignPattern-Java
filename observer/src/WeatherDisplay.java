import interfaces.Data;
import interfaces.Observer;
import interfaces.Subject;

public class WeatherDisplay implements Observer {
    private double temperature;
    private double humidity;
    private double pressure;

    public WeatherDisplay(Subject subject) {
        subject.registerObserver(this);
    }

    @Override
    public void update(Data d) {
        WeatherData weatherData = (WeatherData) d;
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();
        this.display();
    }

    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "WeatherDisplay{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}';
    }
}
