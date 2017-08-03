import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapFunctionality {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("a", 100);
		map.put("b", 200);
		map.put("c", 300);
		map.put("d", 400);
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		
		for(Map.Entry<String, Integer> s:entry) {
			System.out.print(s.getKey() + " ");
			System.out.println(s.getValue());
		}
		
	}
}
