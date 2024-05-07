import java.util.*;
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();

        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);


        l1.add(51);
        l1.add(52);
        l1.add(53);
        l1.add(54);
        l1.add(55);
        l1.add(56);
        l1.add(57);

        l1.add(0,49);
        l1.add(0,48);

        l1.addAll(0,l2);

        l1.addLast(99);
        l1.addFirst(1);
        
        System.out.println(l1.contains(27));
        System.out.println(l1.indexOf(55));
        System.out.println(l1.lastIndexOf(55));

        System.out.println(l1);
        // l1.clear();

        l1.set(1,566);
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }




    }
}
