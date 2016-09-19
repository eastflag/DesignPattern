package Observer;
public class Main {
    public static void main(String[] args) {
        WeatherGenerator generator = new RandomWeatherGenerator();
        Client observer1 = new ConsoleClient();
        Client observer2 = new AndroidClient();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        generator.generateTemperature();
    }
}
