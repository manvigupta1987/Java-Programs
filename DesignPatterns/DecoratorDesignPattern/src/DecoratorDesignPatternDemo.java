
public class DecoratorDesignPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizza simplePizza = new SimplePizza("Plain Pizza");
		System.out.println( simplePizza.getDescription() +
                " Cost :" + simplePizza.getCost());
		
		FreshTomato simplePizzaWithTamotao = new FreshTomato(simplePizza);
		System.out.println( simplePizzaWithTamotao.getDescription() +
                " Cost :" + simplePizzaWithTamotao.getCost());
		
		
		Paneer pizzaWithPaneerTomato = new Paneer(simplePizzaWithTamotao);
		System.out.println( pizzaWithPaneerTomato.getDescription() +
                " Cost :" + pizzaWithPaneerTomato.getCost());
	}

}
