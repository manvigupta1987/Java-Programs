
public class TwentyNotesHandler extends MoneyHandler {

	public TwentyNotesHandler() {
		this.moneyHandled = MoneyHandler.TWENTY_HANDLER;
	}
	
	@Override
	public int issueNotes(int numberOfNotes) {
		// TODO Auto-generated method stub
		
		System.out.println("20 $ Notes Issued: "+ numberOfNotes );
		return 0;
	}
}
