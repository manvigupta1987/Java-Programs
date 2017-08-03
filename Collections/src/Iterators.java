import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for (int i = 0; i < 10; i++)
            arrayList.add(i);
		
		Iterator<Integer> itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			
			int i = itr.next();
			System.out.println(i);
			
			// remove odd elements from array
			if(i%2!=0) {
				itr.remove();
			}
			
		}
		
		System.out.println(); 
        System.out.println(arrayList);
		
	}
}
