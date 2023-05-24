
package Lab13;
import java.util.Vector;

public class VectorOperations {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();

        // Inserting elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        System.out.println("Vector after insertion: " + vector);

        // Deleting element at index 1
        vector.remove(1);

        System.out.println("Vector after deletion: " + vector);

        // Accessing element at index 0
        String element = vector.get(0);
        System.out.println("Element at index 0: " + element);
    }
}
