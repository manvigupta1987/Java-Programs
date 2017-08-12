
public abstract class Shape {
	
	protected ColorAPI colorApi;
	
	public Shape(ColorAPI colorApi) {
		this.colorApi = colorApi;
	}
	
	abstract void drawShape();
}
