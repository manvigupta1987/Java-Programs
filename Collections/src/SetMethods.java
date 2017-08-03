import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Set<String> hash_Set = new HashSet<>();
	hash_Set.add("Geeks");
    hash_Set.add("For");
    hash_Set.add("Geeks");
    hash_Set.add("Example");
    hash_Set.add("Set");
    
    System.out.print("Set output without the duplicates");
    
    System.out.println(hash_Set);
    
    System.out.print("Sorted Set after passing into TreeSet");
    
    Set<String> tree_set = new TreeSet<>(hash_Set);
    
    System.out.println(tree_set);
    
	}

}
