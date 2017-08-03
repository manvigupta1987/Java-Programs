import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionDiffUsingSet {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.addAll(Arrays.asList(new Integer[] {1, 3, 2, 4, 8, 9, 0}));
        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(new Integer[] {1, 3, 7, 5, 4, 0, 7, 5}));
        
        //Union 
        Set<Integer> union_set = new HashSet<>(set1);
        union_set.addAll(set2);
        
        System.out.println("Union is ");
        System.out.println(union_set);
        
        
        //Intersection
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection is ");
        System.out.println(intersection);
        
        
      //Difference
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference is ");
        System.out.println(difference);    
	}
}
