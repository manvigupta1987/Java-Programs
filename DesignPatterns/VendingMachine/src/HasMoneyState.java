
public class HasMoneyState implements VendingMachineState{

	@Override
	public void selectProductAndInsertMoney(String product, int amount) {
		// TODO Auto-generated method stub
		System.out.println("Vending machine is already processing one order. Can not accept other request now.");
	}

	@Override
	public void dispenseProduct() {
		// TODO Auto-generated method stub
		System.out.println("Vending machine dispensed the product ... ");		
	}
}