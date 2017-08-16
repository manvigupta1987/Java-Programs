
public class InsertionSort implements SortingStrategy{

	@Override
	public int[] sort(int[] array) {
		// TODO Auto-generated method stub
		for(int i=1; i<array.length; i++) {
			
			int key = array[i];
			int j = i-1;
			while(j>=0 && key<array[j]) {
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = key;
		}
		return array;
	}	
}
