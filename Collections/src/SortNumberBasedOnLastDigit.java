
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortNumberBasedOnLastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(305);
		list.add(998);
		list.add(774);
		list.add(236);
		list.add(881);
		
		//System.out.println("before sorting");
		//list.forEach(System.out::println);
		
//		Comparator<Integer> com = new Comparator<Integer>() {
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o1%10>o2%10?1:-1;
//			}	
//		};
//		Collections.sort(list,com);
		
		//Lamda operations allows your to write complete code in just one line.
		
		Collections.sort(list, (o1,o2)->
		{
			return o1%10>o2%10?1:-1;
		});
		
		for(int i:list){
			System.out.println(i);
		}
	}
}
