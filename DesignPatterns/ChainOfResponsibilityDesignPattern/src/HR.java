
public class HR extends Employee{
	
	
	public HR(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}

	@Override
	public void write(){
		// TODO Auto-generated method stub
		System.out.println("HR: Leave approved");
	}
}
