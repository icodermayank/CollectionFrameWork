import java.util.*;
public class HashMapExample {
    public static void main(String [] args){
        // creating HashMap.
        HashMap <Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2,"Python");
        map.put(3,"Kotlin");
        map.put(4,"JavaScript");
        map.put(5,"Kivy");

        // printing HashMap.
        System.out.println(map);

        //printing value in set.
        Set set =  map.entrySet();
        System.out.println(set);

        // getting values one by one
        Iterator itr = set.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        // getting key and values seperate.
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
           // System.out.println(entry.getKey());
            System.out.print(entry.getValue()+" ");

        }

        // using for each loop. to get values.
        System.out.println();
        for(Map.Entry me : map.entrySet()){
            System.out.println(me.getKey()+" -- "+me.getValue());
        }
    }
}
