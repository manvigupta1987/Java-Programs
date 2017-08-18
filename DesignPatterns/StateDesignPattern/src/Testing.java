
public class Testing implements ProjectState{

	@Override
	public void doRequirementGathering() {
		// TODO Auto-generated method stub
		System.out.println("Requirement Gathering not possible in this state ");
	}

	@Override
	public void doDesignAndArch() {
		// TODO Auto-generated method stub
		System.out.println("Design and Archtecture is not allowed in this state");
	}

	@Override
	public void doDevelopement() {
		// TODO Auto-generated method stub
		System.out.println("Developement only bug fixes are possible in this state");
	}

	@Override
	public void doTesting() {
		// TODO Auto-generated method stub
		System.out.println("Testing is in process, will take 30 days");
	}	
}
