package Observer;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {
    private ArrayList<Observer> mObservers = new ArrayList<Observer>();     // Observer들을 저장
    public void addObserver(Observer observer) {    // Observer을 추가
        mObservers.add(observer);
    }
    public void deleteObserver(Observer observer) {  // Observer을 삭제
        mObservers.remove(observer);
    }
    public void notifyObservers() {                  // Observer에 통지
        Iterator<Observer> it = mObservers.iterator();      
        while (it.hasNext()) {                 
            Observer o = (Observer)it.next();  
            o.update(this);                   
        }                                     
    }                                      
    public abstract int getNumber();                // 수를 취득한다
    public abstract void execute();                  // 수를 생성한다
}
