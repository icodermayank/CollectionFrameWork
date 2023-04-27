import java.util.HashSet;
public class HashSetExample {
   public static void main(String [] args){
    HashSet <Object>  hs = new HashSet<>();

    hs.add(10);
    hs.add(23.45);
    hs.add('c');
    hs.add("Mayank");
    hs.add(0);

    System.out.println(hs);

   } 
}
