import java.nio.charset.MalformedInputException;
import java.util.HashMap;
import java.util.Map;

public class ShapeFactory{
	 
	private static HashMap<String, Shape> hashMap = new HashMap<>();
	public static Shape getShape(String colorType) {
		Circle circle = null;
		if(hashMap.containsKey(colorType)) {
			circle = (Circle)hashMap.get(colorType);
		}
		
		if(circle == null) {
			circle = new Circle(colorType);
			hashMap.put(colorType, circle);
			System.out.println("Creating circle of color : " + colorType);
		}
		
		return circle;
	}
	

}
