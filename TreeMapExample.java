// TreeMap used Redblack Tree
// TreeMap has defalut sorting order 
//TreeMap doesnot follows insertion order but it follows sorting order
import java.util.*;
public class TreeMapExample {
    public static void main(String [] args){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(101,"Java");
        map.put(105,"Python");
        map.put(103,"Html");
        map.put(102,"Ruby");

        System.out.println(map);
        
        // clears all the map
       // map.clear(); 

        System.out.println(map.ceilingEntry(102)); // greater or equal

        System.out.println(map.ceilingKey(104));

        System.out.println(map.containsKey(104));

        System.out.println(map.containsValue("Html"));

        System.out.println(map.firstEntry());

        System.out.println(map.floorEntry(104)); // lower or equal

        System.out.println(map.get(104));

        System.out.println(map.headMap(102));

        System.out.println(map.higherKey(101));

        System.out.println(map.isEmpty());

        System.out.println(map.keySet());

        System.out.println(map.lastEntry());

        System.out.println(map.pollFirstEntry());

        System.out.println(map);


        map.remove(103);
        map.replace(102,"Perl");

        System.out.println(map);

        System.out.println(map.size());

        System.out.println(map.subMap(100,106));

    }
}
