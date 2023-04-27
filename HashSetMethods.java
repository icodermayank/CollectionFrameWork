import java.util.*;

public class HashSetMethods {
    public static void main(String [] args){
        HashSet<Object> hset = new HashSet<>();
        
        // add method
        hset.add(5);
        hset.add("string");
        hset.add(10.5);
        hset.add('k');
        hset.add("Mayank");
        hset.add(new String("str"));

        System.out.println("Is Set Empty: "+(hset.isEmpty()));
        System.out.println("Size of the HashSet: "+hset.size());
        // removing the element from the HashSet.
        hset.remove('k');
        // checking if element is present or not.
        System.out.println("Is contains '5':" +hset.contains(5));


        // iterator returns the iterator over the element in the HashSet.

        Iterator itr = hset.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }


        // clear method removes all elements from the HashSet.

        hset.clear();

        System.out.println("\nIs Empty: "+hset.isEmpty());
    }
}
