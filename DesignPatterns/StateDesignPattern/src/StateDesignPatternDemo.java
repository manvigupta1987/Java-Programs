
public class StateDesignPatternDemo {
	
	public static void main(String[] args) {
		ProjectContext projectContext = new ProjectContext();
		projectContext.doDesignAndArch();
		projectContext.doTesting();
		
		projectContext.doRequirementGathering();
		projectContext.doDesignAndArch();
		projectContext.doDevelopement();
		projectContext.doDesignAndArch();
		projectContext.doTesting();
		
	}
}
