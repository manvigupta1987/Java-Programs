
public class MainClass {
	
	public static void main(String[] args) {
		
		Employee teamLead = new TeamLead(Employee.LEADLeave);
		Employee Hr = new HR(Employee.HRLeave);
		Employee manager = new Manager(Employee.ManagerLeave);
		
		teamLead.setApprover(manager);
	    manager.setApprover(Hr);
	    
	    teamLead.approveLeave(25);
	    teamLead.approveLeave(10);
	}
}
