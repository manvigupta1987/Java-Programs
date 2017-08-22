
//Refer https://kevalpatel2106.wordpress.com/2016/12/

public class SingleTon {
	
	//public static SingleTon instance = new SingleTon(); // Eager Intialization;
	public static volatile SingleTon instance; //Without volatile, it is possible for
	//another thread in Java to see half initialized state of _instance variable, 
	//but with volatile variable guaranteeing happens-before relationship, all the
	//write will happen on volatile sSoleInstance before any read of sSoleInstance 
	//variable.
	public String sname; 
	private SingleTon() {
		//Prevent form the reflection api.
        if (instance != null){
            throw new RuntimeException("Use getInstance() method to get the single instance of this class.");
        }
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
	
	//Make singleton from serialize and deserialize operation.
    protected SingleTon readResolve() {
        return getInstance();
    }
}


//avoids reflection problem also. It is thread safe.
//enum SingleTon{
//	INSTANCE;
//	private String sname; 
//	
//	public void setMessage(String str) {
//		sname = str;
//	}
//	public void showMessage(){
//		   System.out.println(sname);
//	}
	
//}
