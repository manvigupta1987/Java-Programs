
public class FiftyNotesHandler extends MoneyHandler {

	public FiftyNotesHandler() {
		this.moneyHandled = MoneyHandler.FIFTY_HANDLER;
	}
	
	@Override
	public int issueNotes(int numberOfNotes) {
		// TODO Auto-generated method stub
		
		System.out.println("50 $ Notes Issued: "+ numberOfNotes );
		return 0;
	}
}
