import java.util.Random;

public class FlyWeightDesignDemo {

	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for(int i=0; i < 20; ++i) {
			
	         Circle circle = (Circle)ShapeFactory.getShape(getRandomColor());
	         circle.draw();
	      }
		}
	
	private static String getRandomColor() {
		Random random = new Random();
		return colors[(random.nextInt(colors.length))];
	}
}
