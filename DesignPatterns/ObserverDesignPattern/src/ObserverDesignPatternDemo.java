/** Observer design patter is used where there is one to many relationship between objects
 * such that if one object is changed, other needs to be notified automatically. 
 * It has Subject and Observer. 
 * Here we have implemented the Stock market where we have three subjects i.e IBM, Microsoft,
 * Apple and two observer Desktop and mobile. Whenever any change will happen in the 
 * stock price, observer will be update with updated price. 
 * @author manvi
 *
 */


public class ObserverDesignPatternDemo {
	
	public static void main(String[] args) {
		
		//Create observable subjects 
		Apple apple = new Apple();
		IBM ibm = new IBM();
		MicroSoft microSoft = new MicroSoft();
		
		//Create Observer
		Desktop desktop = new Desktop();
		Mobile mobile = new Mobile();
		
		ibm.registerObserver(desktop);
		ibm.registerObserver(mobile);
		
		apple.registerObserver(mobile);
		apple.registerObserver(desktop);
		
		microSoft.registerObserver(mobile);
		microSoft.registerObserver(desktop);
		
		for(int i = 0; i< 5 ; i++) {
		
			ibm.updateStockPrice((int)(Math.random()*101)+1);
			microSoft.updateStockPrice((int)(Math.random()*101)+1);
			apple.updateStockPrice((int)(Math.random()*101)+1);
		}		
	}
}
