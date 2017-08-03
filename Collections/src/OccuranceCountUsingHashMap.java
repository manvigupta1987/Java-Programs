import java.util.HashMap;
import java.util.Map;

/* Java program to print frequencies of all elements using 
   HashMap */
//This program takes O(1) in get, put and contains key. It also depends on how much time it takes to hash.
public class OccuranceCountUsingHashMap {
	public static void main(String[] args) {
		
		int arr[] = {10, 34, 5, 10, 3, 5, 10};
        printFreq(arr);
	}
	
	public static void printFreq(int arr []) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i:arr){
			Integer c = map.get(i);
			if(map.get(i) == null) {
				map.put(i, 1);
			}else {
				map.put(i, ++c);
			}
		}
	
		for(Map.Entry<Integer,Integer>s:map.entrySet()) {
			System.out.println("Frequency of " + s.getKey() + 
                    " is " + s.getValue());
		}
	}
}
