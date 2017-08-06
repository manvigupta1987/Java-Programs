
public class SingleTon {
	
	//public static SingleTon instance = new SingleTon(); // Eager Intialization;
	public static SingleTon instance;
	public String sname; 
	private SingleTon() {
		sname = "Singleton Class";
	}
	
//	public static SingleTon getInstance() {
//		if(instance == null) {
//			instance = new SingleTon();   //Lazy Initialization
//		}
//		return instance;
//	}
	
	//Double lock checking which provides thread safety and faster performance.
	public static SingleTon getInstance() {
		if(instance == null) {
			synchronized(SingleTon.class) {
				if(instance == null) {
					instance = new SingleTon();
				}
			}
		}
		return instance;
	}
	
	public void showMessage(){
	   System.out.println(sname);
	}
}
