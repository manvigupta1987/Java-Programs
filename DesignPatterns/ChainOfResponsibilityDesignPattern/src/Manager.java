
public class Manager extends Employee{
	
	
	public Manager(int level) {
		this.numberOfDays = level;
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Manager: Leave Approved");
	}
}
