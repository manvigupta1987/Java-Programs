
public abstract class Employee {
	public static int HRLeave = 30;
	public static int ManagerLeave = 20 ;
	public static int LEADLeave = 10; 
	
	protected int numberOfDays;
	
	protected Employee nextApprover;
	
	public void setApprover(Employee nextApprover) {
		this.nextApprover = nextApprover;
	}
	
	public abstract void write();
	
	public void approveLeave(int numberOfDays) {
		if(this.numberOfDays >= numberOfDays) {
			this.write();
		} else {
			if(nextApprover!=null) {
				nextApprover.approveLeave(numberOfDays);
			}
		}
	}
}
	
	
	