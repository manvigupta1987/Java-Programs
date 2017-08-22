
public class NoMoneyState implements VendingMachineState{

	@Override
	public void selectProductAndInsertMoney(String product, int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " Rs. is inserted and product " + product + "is selected");
	}

	@Override
	public void dispenseProduct() {
		// TODO Auto-generated method stub
		System.out.println("Vending machine can not dispense product as there is no money inserted");		
	}
}
