


/** SingleTon allows only one instance of a class. So all the instance of a class must
 * keep the same hashCode.
 * @author manvi
 */

public class SingleTonDemoMain {
	public static void main(String[] args) {
		SingleTon instance1 = SingleTon.getInstance();
		instance1.showMessage();
		
		SingleTon instance2 = SingleTon.getInstance();
		instance2.sname = "It is still a SingleTon Class";
		instance1.showMessage();
		
		System.out.println("instance 1 hash code = " + instance1.hashCode());
		System.out.println("instance 2 hash code = " + instance2.hashCode());
	}
}
