import java.util.HashMap;

public class ShapeCache {
	
	private static HashMap<String, Shape> map = new HashMap<>();
	
	public static void loadCache() {
		Shape circle = new Circle();
		circle.setId("1");
		map.put(circle.getId(), circle);
		
		Shape rectangle = new Rectangle();
		rectangle.setId("2");
		map.put(rectangle.getId(), rectangle);
		
		Shape square = new Square();
		square.setId("3");
		map.put(square.getId(), square);		
	}
	
	
	public static Shape getCloneObject(String id) {
		Shape object = map.get(id);
		return (Shape)object.Clone();		
	}
}
