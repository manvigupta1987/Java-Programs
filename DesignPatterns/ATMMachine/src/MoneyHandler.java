
public abstract class MoneyHandler {
	
	public static int FIFTY_HANDLER = 50;
	public static int TWENTY_HANDLER = 20;
	public static int TEN_HANDLER = 10;
	
	private MoneyHandler nextHandler;
	protected int moneyHandled; 

	public void setNextHandler(MoneyHandler nextHandler) {
		this.nextHandler = nextHandler;
	}
	
	public abstract int issueNotes(int numberOfNotes);
	
	public void dispatchMoney(int amount) {
		if(amount >= this.moneyHandled) {
			int numberOfNotes = amount / this.moneyHandled;
			this.issueNotes(numberOfNotes);
			
			int reminder = amount % this.moneyHandled;
			if(reminder!=0) {
				this.nextHandler.dispatchMoney(reminder);
			}
		}
	}
	
	
}
