
public interface Observable {
	public void registerObserver(Observer observer);
	public void notifyObserver();
	public void unregisterObserver(Observer observer);
}
