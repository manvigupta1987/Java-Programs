
public class VendingMachineMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VendingMachine vendingMachine = new VendingMachine();
		vendingMachine.dispenseProduct();
		vendingMachine.selectProductAndInsertMoney("Coke", 20);
		vendingMachine.selectProductAndInsertMoney("Pepsi", 10);
		vendingMachine.dispenseProduct();
		
		vendingMachine.selectProductAndInsertMoney("Pepsi", 10);
		vendingMachine.dispenseProduct();
	}
}
