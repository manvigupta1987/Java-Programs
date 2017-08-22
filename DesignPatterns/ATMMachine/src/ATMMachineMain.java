import java.util.Scanner;

public class ATMMachineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MoneyHandler fiftyMoneyHandler = new FiftyNotesHandler();
		MoneyHandler twentyMoneyHandler = new TwentyNotesHandler();
		MoneyHandler tenMoneyHandler = new TenNotesHandler();
		
		fiftyMoneyHandler.setNextHandler(twentyMoneyHandler);
		twentyMoneyHandler.setNextHandler(tenMoneyHandler);
		
		while(true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			
			if(amount % 10 !=0 ) {
				System.out.println("Entered amount should be multiple of ten");
				return; 
			}
			
			fiftyMoneyHandler.dispatchMoney(amount);
		}

	}
}
