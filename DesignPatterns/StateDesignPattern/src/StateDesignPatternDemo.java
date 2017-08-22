/** State design pattern allows object to change its behavior based on its internal states
 * Here, We are taking the example of Software development cycle where internal states are
 * requirement gathering, design and arch, developement, and testing. So, when requirement gather is
 * in process, other steps can't be processed.
 * @author manvi
 *
 */



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
