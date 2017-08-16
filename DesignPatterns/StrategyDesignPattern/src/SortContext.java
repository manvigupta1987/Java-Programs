
public class SortContext {
	
	private SortingStrategy sortingStrategy;
	
	public void setStrategy(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;		
	}
	
	public void sort(int[] array) {
		sortingStrategy.sort(array);
		printArray(array);
	}
	
	private void printArray(int[] array) {
		
		for(int i =0; i<array.length; i++) {
			System.out.println(array[i] + ",");
		}
		System.out.println("\n");
	}
}
