import java.util.*;
public class TreeMapExample {
    public static void main(String [] args){
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(101,"Java");
        map.put(104,"Python");
        map.put(103,"Html");

        System.out.println(map);
    }
}
