package Singleton;

public class Main {

	/**
	 * 티켓 발권기
	 */
	public static void main(String[] args) {
		TicketMakerNoCommander t1 = new TicketMakerNoCommander();
		int ticket1 = t1.getNextTicketNumber();
		TicketMakerNoCommander t2 = new TicketMakerNoCommander();
		int ticket2 = t2.getNextTicketNumber();
		
		//TicketMaker t1 = new TicketMaker();
		TicketMaker.getInstance().getNextTicketNumber();
	}

}

class TicketMakerNoCommander {
	private int ticket = 1000;
	
	public int getNextTicketNumber(){
		return ++ticket;
	}
}

class TicketMaker {
	
	private static TicketMaker singleton;
	private int ticket = 1000;
	
	private TicketMaker(){
		
	}
	
	public static synchronized TicketMaker getInstance(){
		if(singleton == null){
			singleton = new TicketMaker();
		}
		return singleton;
	}
	
	public int getNextTicketNumber(){
		return ++ticket;
	}
}

