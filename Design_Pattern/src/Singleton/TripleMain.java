package Singleton;

public class TripleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Triple {
	
	private static Triple[] singleton = new Triple[3];
	
	private Triple(){}
	
	public static Triple getInstance(int index){
		if(singleton[index] == null){
			singleton[index] = new Triple();
		}
		return singleton[index];
	}
}