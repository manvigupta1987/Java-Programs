
public class Mobile implements Observer {

	@Override
	public void update(Stock stock) {
		// TODO Auto-generated method stub
		System.out.println("Mobile: Price of Stock " + stock.getStockName() + " has changed to "+ stock.getStockPrice());
	}
}
