package Observer;
import java.util.Random;

public class RandomWeatherGenerator extends WeatherGenerator {
    private Random random = new Random();   // 난수발생기
    private int mTemperature;                        // 현재의 수
    
    public int getTemperature() {                   // 수를 취득한다
        return mTemperature;
    }
    
    public void generateTemperature() {
    	System.out.println("Weather Cast Start");
    	
        for (int i = 0; i < 3; i++) {
        	try {
    			Thread.sleep(1000 * random.nextInt(10));
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
        	
            mTemperature = random.nextInt(30);
            notifyObservers();           
        }
        
        System.out.println("Weather Cast End");
    }
}
