
public class VendingMachine implements VendingMachineState {
	
	private VendingMachineState vendingMachineState;
	
	public VendingMachine() {
		// TODO Auto-generated constructor stub
		this.vendingMachineState = new NoMoneyState();
	}
	
	
	public VendingMachineState getVendingMachineState() {
		return vendingMachineState;
	}


	public void setVendingMachineState(VendingMachineState vendingMachineState) {
		this.vendingMachineState = vendingMachineState;
	}


	@Override
	public void selectProductAndInsertMoney(String product, int amount) {
		// TODO Auto-generated method stub
		vendingMachineState.selectProductAndInsertMoney(product, amount);
		if(vendingMachineState instanceof NoMoneyState) {
			setVendingMachineState(new HasMoneyState());
			System.out.println("Vending machine internal state changed to " + vendingMachineState.getClass().getName());
		}		
	}

	@Override
	public void dispenseProduct() {
		// TODO Auto-generated method stub
		vendingMachineState.dispenseProduct();
		if(vendingMachineState instanceof HasMoneyState) {
			setVendingMachineState(new NoMoneyState());
			System.out.println("Vending machine internal state changed to " + vendingMachineState.getClass().getName());
		}	
	}
}
