/** Composite design pattern is used to create a group of objects which will be treated
 * in a same way as single object. It helps in providing the tree structure. 
 * Below example shows the hierarchy in the a company where CEO is the boss. headsales
 * and headMarketing comes under CEO and clerks and salesExecutives comes under headMarketing
 * and headSales respectively.
 */

public class CompositeDesignPatternDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Composite CEO = new Composite("John","CEO", 30000);
		Composite headSales = new Composite("Robert","Head Sales", 20000);
		Composite headMarketing = new Composite("Michel","Head Marketing", 20000);
		
		Employee clerk1 = new Leaf("Laura","Marketing", 10000);
	    Employee clerk2 = new Leaf("Bob","Marketing", 10000);
		
	    Employee salesExecutive1 = new Leaf("Richard","Sales", 10000);
	    Employee salesExecutive2 = new Leaf("Rob","Sales", 10000);
	    
	   headSales.addEmployee(salesExecutive1);
	   headSales.addEmployee(salesExecutive2);

	   headMarketing.addEmployee(clerk1);
	   headMarketing.addEmployee(clerk2);
	   
	   CEO.addEmployee(headSales);
	   CEO.addEmployee(headMarketing);
	   
	   CEO.showDetails();
	}
}
