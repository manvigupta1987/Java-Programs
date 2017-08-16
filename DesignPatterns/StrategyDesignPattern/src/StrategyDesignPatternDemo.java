
public class StrategyDesignPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortContext sortContext = new SortContext();
		
		int[] array = {3, 4, 5, 1,2};
		sortContext.setStrategy(new SelectionSort());
		sortContext.sort(array);
		
		int[] array1 = {65, 12, 76, 1,2};
		sortContext.setStrategy(new BubbleSort());
		sortContext.sort(array1);
		
		int[] array2 = {65, 12, 76, 1,2};
		sortContext.setStrategy(new InsertionSort());
		sortContext.sort(array2);
	}

}
