
public class ProjectContext implements ProjectState{
	
	protected ProjectState projectState;
	
	public ProjectContext() {
		this.projectState = new RequirementGathering();
	}

	public ProjectState getProjectState() {
		return projectState;
	}

	public void setProjectState(ProjectState projectState) {
		this.projectState = projectState;
	}

	@Override
	public void doRequirementGathering() {
		// TODO Auto-generated method stub
		projectState.doRequirementGathering();
		if(projectState instanceof RequirementGathering) {
			setProjectState(new DesignArchtecture());
		}
	}

	@Override
	public void doDesignAndArch() {
		// TODO Auto-generated method stub
		projectState.doDesignAndArch();
		if(projectState instanceof DesignArchtecture) {
			setProjectState(new Developement());
			}
	}

	@Override
	public void doDevelopement() {
		// TODO Auto-generated method stub
		
		projectState.doDevelopement();
		if(projectState instanceof Developement) {
			setProjectState(new Testing());
			
			}
	}

	@Override
	public void doTesting() {
		// TODO Auto-generated method stub
		
		projectState.doTesting();
	}
}
