
public class Paneer extends PizzaDecorator {
	
	public Paneer (Pizza pizza) {
		super(pizza);
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + 100;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return (pizza.getDescription() + ", Paneer");
	}
}
