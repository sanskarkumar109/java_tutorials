import java.util.ArrayDeque;

public class arrayDeque extends Thread{
    public static void main(String[] args) {
        ArrayDeque <Integer> add1=new ArrayDeque<>();
        add1.add(6);
        add1.add(56);
        add1.add(9);
        add1.add(45);
        System.out.println(add1);

        // addfirst() is used to add element at the front of a dequeue;
        System.out.println("after adding element at the first of the dequeue : ");
        add1.addFirst(50);
        add1.offerFirst(20);
        System.out.println(add1);

        // addlast() is used to add element at last of the dequeue;
        add1.addLast(100);
        add1.offerLast(120);
        System.out.println("after adding element at last of the dequeue : ");
        System.out.println(add1);

        // getfirst() and peekFirst() is used to get the first element at 0 index in the dequeue
        System.out.println(add1.getFirst());
        System.out.println(add1.peekFirst());

        // addLast() and peekLast() is used to grt the last element from the dequeue
        System.out.println(add1);
        System.out.println(add1.getLast());
        System.out.println(add1.peekLast());

        // removeFirst() and pollFirst() is used to delete the element at 0 index;
        System.out.println(add1);
        System.out.println(add1.removeFirst());
        System.out.println(add1.pollFirst());

        // removelast() and polllast() is used to delete the element at last index
        System.out.println(add1);
        System.out.println(add1.removeLast());
        System.out.println(add1.pollLast());


    }
}
