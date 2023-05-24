
package Lab13;
import java.util.HashMap;
import java.util.Map;

public class MapOperations {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Put key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);

        System.out.println("Map after putting key-value pairs: " + map);

        // Clear the map
        map.clear();

        System.out.println("Map after clearing: " + map);
    }
}
