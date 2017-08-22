
public class TenNotesHandler extends MoneyHandler {

	public TenNotesHandler() {
		this.moneyHandled = MoneyHandler.TEN_HANDLER;
	}
	
	@Override
	public int issueNotes(int numberOfNotes) {
		// TODO Auto-generated method stub
		
		System.out.println("10 $ Notes Issued: "+ numberOfNotes );
		return 0;
	}
}