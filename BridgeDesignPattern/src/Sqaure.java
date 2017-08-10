
public class Sqaure extends Shape{

	public Sqaure(ColorAPI colorApi) {
		super(colorApi);
	}

	@Override
	void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("Sqaure is drawn and");
		colorApi.fillColor();
	}
}
