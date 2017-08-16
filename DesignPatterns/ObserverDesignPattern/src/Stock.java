import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public abstract class Stock implements Observable {
	
	private String stockName;
	private double stockPrice;
	
	private List<WeakReference<Observer>> observerList; 
	//Used weak reference to avoid memory leak (happens when unregister function is not called). 
	
	public Stock() {
		observerList = new ArrayList<>();
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public double getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(double stockPrice) {
		this.stockPrice = stockPrice;
	}
	
	@Override
	public void registerObserver(Observer observer) {
		if(observer != null) {
			observerList.add(new WeakReference<Observer>(observer));
		}
	}
	
	@Override
	public void notifyObserver() {
//		Iterator<WeakReference<Observer>> iterator= observerList.iterator();
//		while(iterator.hasNext()) {
//			 WeakReference<Observer> weakRef = iterator.next();
//			 weakRef.get().update(this);		        
//		}
		for(WeakReference<Observer> item:observerList) {
			item.get().update(this);
		}
	}
	
	@Override
	public void unregisterObserver(Observer observer) {
		if(observer!= null) {
			observerList.remove(observer);
		}
	}
	
	public void updateStockPrice(double price) {
		this.stockPrice = price;
		notifyObserver();
	}
}
