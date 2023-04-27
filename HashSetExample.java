import java.util.HashSet;
import java.util.*;

public class HashSetExample {
   public static void main(String [] args){
    // 
    HashSet <Object>  hs = new HashSet<>();

   // HashSet<String> hset = new HashSet<>();

    hs.add(10);
    hs.add(10);  // HashMap doesnot contains duplicate values.
    hs.add(23.45);
    hs.add('c');
    hs.add("Mayank");
    hs.add(0);
    hs.add(null);
    hs.add(null); // we can't add multiple null values.

    System.out.println(hs);



    // printing One By One
    Iterator itr = hs.iterator();

    while(itr.hasNext()){
        System.out.println(itr.next());
    }

  

   } 
}
