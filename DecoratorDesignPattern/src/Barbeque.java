
public class Barbeque extends PizzaDecorator {
	
	public Barbeque (Pizza pizza) {
		super(pizza);
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return pizza.getCost() + 90;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return (pizza.getDescription() + ", Barbeque");
	}
}

