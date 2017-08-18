
public class Developement implements ProjectState{

	@Override
	public void doRequirementGathering() {
		// TODO Auto-generated method stub
		System.out.println("Requirement Gathering (Only questions) are allowed in this state");
	}

	@Override
	public void doDesignAndArch() {
		// TODO Auto-generated method stub
		System.out.println("Design and Archtecture is not allowed in this state");
	}

	@Override
	public void doDevelopement() {
		// TODO Auto-generated method stub
		System.out.println("Developement is in progress, will take 40 days");
	}

	@Override
	public void doTesting() {
		// TODO Auto-generated method stub
		System.out.println("Testing not possible in this state");
	}	
}
