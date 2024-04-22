import java.util.*;

public class arraylist_merge {
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        System.out.println("values in list l1  : " + l1);
        System.out.println("values in list l2  : " + l2);

        l1.addAll(l2);

        System.out.println("l1 arraylist after merging : " + l1);
        System.out.println("l2 arraylist " + l2);

    }
}
