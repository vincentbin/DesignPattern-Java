public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(1.0, 2.0, 3.0);

        new WeatherDisplay(weatherData);

        weatherData.setHumidity(5.0);
        weatherData.setPressure(1.5);
        weatherData.setTemperature(8.0);
    }
}
