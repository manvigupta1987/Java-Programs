import java.util.TreeSet;

public class TreeSetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String>ts5 = new TreeSet<>();
		ts5.add("GeeksforGeeks");
        ts5.add("Compiler");
        ts5.add("practice");
        
        //first element
        System.out.println(ts5.first());
        System.out.println(ts5.last());
        
        System.out.println(ts5.headSet("O"));
        System.out.println(ts5.tailSet("G"));
        
        System.out.println(ts5.subSet("C","P"));
        
        // Deletes all elements from ts5.
        ts5.clear();
 
        // Prints nothing
        System.out.println(ts5);    
	}

}
