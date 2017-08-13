
public class Circle implements Shape{
	
	private String color;
	
	public Circle(String color) {
		// TODO Auto-generated constructor stub
		this.color = color; 
	}

	public String getColor() {
		return color;
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing circle with color "+ color);		
	}
}
