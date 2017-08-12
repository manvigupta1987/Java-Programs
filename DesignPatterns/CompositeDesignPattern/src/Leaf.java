
public class Leaf implements Employee{

	private String name;
	private String position;
	private long empId;
	
	
	public Leaf(String name, String position, long empId) {
		super();
		this.name = name;
		this.position = position;
		this.empId = empId;
	}

	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println(empId+" " +name+ " " + position );
	}
}
