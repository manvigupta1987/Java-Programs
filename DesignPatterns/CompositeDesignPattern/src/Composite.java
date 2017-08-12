import java.util.ArrayList;
import java.util.List;

public class Composite implements Employee{

	private String name;
	private String position;
	private long empId;
	private List<Employee> list;
	
	
	public Composite(String name, String position, long empId) {
		super();
		this.name = name;
		this.position = position;
		this.empId = empId;
		this.list = new ArrayList<>();
	}
	
	public void addEmployee(Employee employee) {
		list.add(employee);
	}
	
	public void removeEmployee(Employee employee) {
		list.remove(employee);
	}
	
	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		System.out.println(empId+" " +name+ " " + position );
		for(Employee item: list){
			item.showDetails();
		}	
	}
}
