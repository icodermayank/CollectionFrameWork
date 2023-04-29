import java.util.*;
public class MapExample {
   public static void main(String [] args){

    // create the map using the HashMap
    Map< Integer, String> map = new HashMap<>();

    // add key values to the map.
    map.put(1, "Mango");
    map.put(2,"Apple");
    map.put(3, "Lichi");
    map.put(4,"Banana");
    // print the map.
    System.out.println(map);

    // size of the map.
    System.out.println("Size of the map: "+map.size());

    // check empty or not
    System.out.println("is Empty: "+map.isEmpty());

    // removes from the map.
    map.remove(3);
    System.out.println(map);

    // contains key.
    System.out.println("Contains 2: "+map.containsKey(2));

    // contains value.
    System.out.println("Contains 'Lichi' :"+map.containsValue("Lichi"));

    // key set
    System.out.println("Key Set: " +map.keySet());
    // Entry Set.
    System.out.println("Entry Set: "+map.entrySet());

    // values.
    System.out.println("Values :"+map.values());


   } 
}
