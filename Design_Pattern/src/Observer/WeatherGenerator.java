package Observer;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class WeatherGenerator {
    private ArrayList<Client> mObservers = new ArrayList<Client>();     // Observer들을 저장
    public void addObserver(Client observer) {    // Observer을 추가
        mObservers.add(observer);
    }
    public void deleteObserver(Client observer) {  // Observer을 삭제
        mObservers.remove(observer);
    }
    public void notifyObservers() {                  // Observer에 통지
        /*Iterator<Observer> it = mObservers.iterator();      
        while (it.hasNext()) {                 
            Observer o = (Observer)it.next();  
            o.update(this);                   
        }*/
        for(Client observer : mObservers) {
        	observer.update(this);
        }
    }                                      
    public abstract int getTemperature();                // client가 온도를 얻어가는 함수
    public abstract void generateTemperature();          // 온도를 생성하는 함수
}
