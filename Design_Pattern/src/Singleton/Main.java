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
		//System.out.println("main :" + TicketMaker.getInstance().getNextTicketNumber());
		
		//멀티쓰레드 처리가 안된 싱글턴
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thead 1 :" + TicketMaker.getInstance().getNextTicketNumber());
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread 2 :" + TicketMaker.getInstance().getNextTicketNumber());
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread 3 :" + TicketMaker.getInstance().getNextTicketNumber());
			}
		}).start();
		
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
	
	public static TicketMaker getInstance(){
		if(singleton == null){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (TicketMaker.class) {
				if(singleton == null) {
					singleton = new TicketMaker();
				}
			}
			
		}
		return singleton;
	}
	
	public int getNextTicketNumber(){
		return ++ticket;
	}
}

