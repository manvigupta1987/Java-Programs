
public class ProtoypeDesignPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeCache.loadCache();
		
		Shape clonedShape = ShapeCache.getCloneObject("1");
		System.out.println("Shape : " + clonedShape.getType());
		
		Shape clonedShape2 = (Shape) ShapeCache.getCloneObject("2");
	    System.out.println("Shape : " + clonedShape2.getType());		

	    Shape clonedShape3 = (Shape) ShapeCache.getCloneObject("3");
	    System.out.println("Shape : " + clonedShape3.getType());		
	}
}
