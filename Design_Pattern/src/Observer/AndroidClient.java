package Observer;
public class AndroidClient implements Client {
    public void update(WeatherGenerator generator) {
        System.out.print("AndroidClient:");
        int count = generator.getTemperature();
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
