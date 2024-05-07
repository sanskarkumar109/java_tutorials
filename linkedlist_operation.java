import java.util.*;
import java.util.function.DoubleToIntFunction;

public class linkedlist_operation extends Thread {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        l1.add(80);
        System.out.println(l1);

        // add() is used to add element in a linkede list
        l1.add(5, 55);
        System.out.println("after adding at index 5 : ");
        System.out.println(l1);

        // remove() is used to remove element from a linked list
        l1.remove(3);
        System.out.println("after removing from index 3  : ");
        System.out.println(l1);

        // set() is used to replace the element from a given index
        l1.set(3, 40);
        System.out.println("after replacing a element from index 3:  ");
        System.out.println(l1);

        // addlast() is used to add an element at the last index of the linked list
        l1.addLast(100);
        System.out.println("after adding an element at the last index of an linked list");
        System.out.println(l1);

        // addfirst() is used to add an element at the first index of an linked list
        l1.addFirst(1);
        System.out.println("after adding an element at the first index of an linked list");
        System.out.println(l1);

        // 
    }

}
