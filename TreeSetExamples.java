// Simple program to understanding of the TreeSet and their methods.

// package java.util.TreeSet
import java.util.*;
public class TreeSetExamples {
    
    public static void main(String[] args) {
        // creating TreeSet.
        TreeSet<String> myset = new TreeSet<>();

        // add method.
        myset.add("Mango");
        myset.add("Apple");
        myset.add("Banana");
        myset.add("Orange");
        myset.add("Papaya");
        myset.add("Cherry");
        myset.add("Lichi");

        // printing TreeSet.
        System.out.println(myset);

        // printing in Descending order.
        System.out.println(myset.descendingSet());

        // printing SubSet of the Set
        System.out.println("Subset of the set: "+ myset.subSet("Banana" , "Lichi"));

        // Size of the TreeSet
        System.out.println("Size of the TreeSet: "+myset.size());

        // printing first element..
        System.out.println("First Element: "+myset.first());

        // printing last element..
        System.out.println("Last Element: "+myset.last());

        //some other methods..
        /*
         * clear();
         * ceiling();
         * poolFirst(); it return and remove.
         * poolLast(); it return and remove.
         * contains(); return true if present.
         * 
         */


    }

}
