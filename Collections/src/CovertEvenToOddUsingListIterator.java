import java.util.ArrayList;
import java.util.ListIterator;

public class CovertEvenToOddUsingListIterator {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		for (int i = 0; i < 10; i++)
            arrayList.add(i);
		
		System.out.println(arrayList);
		 
		ListIterator<Integer> itr = arrayList.listIterator();
		
		while (itr.hasNext()) {
			int i  = (Integer) itr.next();
			
			if(i%2==0) {
				i++;
				
				itr.set(i); //replaces the element
				itr.add(i); //adds the element at the position before the element returned by next();
			}
		}
		
		System.out.println();
        System.out.println(arrayList);
		
	}
}
