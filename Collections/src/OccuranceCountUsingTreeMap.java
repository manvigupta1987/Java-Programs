import java.util.Map;
import java.util.TreeMap;


/* Java program to print frequencies of all elements using 
   TreeMap */
//This program takes O(nLogN) in get, put and contains key.
public class OccuranceCountUsingTreeMap {
	
		public static void main(String[] args) {
			
			int arr[] = {10, 34, 5, 10, 3, 5, 10};
	        printFreq(arr);
		}
		
		public static void printFreq(int arr []) {
			TreeMap<Integer, Integer> map = new TreeMap<>();
			
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

