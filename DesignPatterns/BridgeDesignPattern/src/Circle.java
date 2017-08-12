
public class Circle extends Shape{

	public Circle(ColorAPI colorApi) {
		super(colorApi);
	}

	@Override
	void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("circle is drawn and");
		colorApi.fillColor();
	}
}
