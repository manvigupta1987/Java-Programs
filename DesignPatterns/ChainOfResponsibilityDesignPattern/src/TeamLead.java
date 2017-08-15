
public class TeamLead extends Employee{
	
	
	public TeamLead(int level) {
		this.numberOfDays = level;
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Team Lead: Leave Approved");
	}
}
