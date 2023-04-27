import java.util.HashSet;
import java.util.ArrayList;

public class HashSetConstructors {
    public static void main(String[] args) {
        // Creating an empty HashSet with the default initial capacity and load factor
        HashSet<String> mySet1 = new HashSet<>();

        // Creating an empty HashSet with a specified initial capacity and the default load factor
        HashSet<Integer> mySet2 = new HashSet<>(10);

        // Creating an empty HashSet with a specified initial capacity and load factor
        HashSet<Float> mySet3 = new HashSet<>(20, 0.5f);

        // Creating a HashSet with the same elements as an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        HashSet<String> mySet4 = new HashSet<>(list);
    }
}
