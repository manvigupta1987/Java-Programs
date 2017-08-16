
public class Desktop implements Observer{

	@Override
	public void update(Stock stock) {
		// TODO Auto-generated method stub
		System.out.println("Desktop: Price of Stock " + stock.getStockName() + " has changed to "+ stock.getStockPrice());
	}

}
