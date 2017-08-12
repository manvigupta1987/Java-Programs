import com.factory.AbstractFactory;
import com.factory.Color;
import com.factory.ColorFactory;
import com.factory.FactoryProducer;
import com.factory.Shape;


/** Abstract factory method is used to create multiple factory objects. Here we have two 
 * factories: One to create shape and other is to Create Color. First we created indiviual
 * Factory to create different shape and different color. Then we created a factoryMethod which
 * can create ShapeFactory and ColorFactory objects. 
 */

public class AbstarctFactoryDesignDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		Color red = colorFactory.getColor("red");
		red.fill();
	}
}
