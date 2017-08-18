
public class DesignArchtecture implements ProjectState{

	@Override
	public void doRequirementGathering() {
		// TODO Auto-generated method stub
		System.out.println("Requirement Gathering not possible in this state");
	}

	@Override
	public void doDesignAndArch() {
		// TODO Auto-generated method stub
		System.out.println("Design and Archtecture is in progress, will take 7 days");
	}

	@Override
	public void doDevelopement() {
		// TODO Auto-generated method stub
		System.out.println("Developement not possible in this state");
	}

	@Override
	public void doTesting() {
		// TODO Auto-generated method stub
		System.out.println("Testing not possible in this state");
	}	
}
