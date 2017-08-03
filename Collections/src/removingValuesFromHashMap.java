import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class removingValuesFromHashMap {
	public static void main(String[] args) {
		HashMap<String, String> Geeks = new HashMap<>();
		 
        //  Adding values to HashMap as ("keys", "values")
        Geeks.put("Language", "Java");
        Geeks.put("Platform", "Geeks For geeks");
        Geeks.put("Code", "HashMap");
        
        Set<Map.Entry<String, String>> mappingGeeks = Geeks.entrySet();
        Iterator<Map.Entry<String,String>> itr = Geeks.entrySet().iterator();
        
        while (itr.hasNext()) {
        	
        	itr.next();
        	itr.remove();			
        	
        	 System.out.println("Set of Keys and Values : "+mappingGeeks);
		}
        
	}
}
