package Observer;
public class ConsoleClient implements Client {
    public void update(WeatherGenerator generator) {
        System.out.println("ConsoleClient:" + generator.getTemperature());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
