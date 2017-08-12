
public class FarmPizza implements Pizza{

	String description;
	public FarmPizza(String deString) {
		// TODO Auto-generated constructor stub
		this.description = deString;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 200;
	}
}

