import java.util.*;
public class hashset extends Thread{
    public static void main(String[] args) {
        HashSet<Integer> h1=new HashSet<>(6,0.5f);
        h1.add(6);
        h1.add(8);
        h1.add(3);
        h1.add(11);
        h1.add(11);
        System.out.println("my hashset before removing element");
        System.out.println(h1);
        System.out.println("my hashset after removing a element");
        h1.remove(3);
        System.out.println(h1);

        // isempty() is used to check whether the hashset has a element or not
        HashSet<Integer> h2=new HashSet<>();
        System.out.println(h1.isEmpty());
        System.out.println(h2.isEmpty());

        // clear() is used to clear all the element or delete all the element from a hashset
        // System.out.println("my hashset before : "+h1);
        // h1.clear();
        // System.out.println("myHashset after : "+h1);

        // size() is used to count the number of elements in the hashlist
        System.out.println("the size of hashset is : "+h1.size());

        




    }
    
}
