
public class FreshTomato extends PizzaDecorator {
	
	
	public FreshTomato (Pizza pizza) {
		super(pizza);
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + 20;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return (pizza.getDescription() + ", Fresh Tomato");
	}
}
