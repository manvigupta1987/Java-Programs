
public class BridgeDesignPatterndemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape redCircle = new Circle(new RedColor());
		redCircle.drawShape();
		
		Shape greenSquare = new Sqaure(new GreenColor());
		greenSquare.drawShape();
	}

}
