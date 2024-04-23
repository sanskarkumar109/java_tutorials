import java.util.*;
public class arraylist_operation extends Thread{
    public static void main(String[] args) {
        ArrayList<Integer> l1=new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(6);
        l1.add(5,5);
        System.out.println(l1);
        l1.remove(2);
        System.out.println("arraylist after removing value at index 2 : \n" + l1);

        //contains() is used to find whether a number is avilable in a arraylist or not
        System.out.println("l1 list contains 7 : "+l1.contains(7));
        System.out.println("l1 list contains 4 : "+l1.contains(4));

        //indexOf() is used to find the occurance of a value i.e first time value coms at
        //  which index 
        l1.add(2);
        System.out.println(l1);
        System.out.println("first occurance of value 2 is at : \n"+l1.indexOf(2));

        //lastindexOf() is used to find the last occurance of the value 

        System.out.println(l1);
        System.out.println("last occurance of value 2 is at : \n"+l1.lastIndexOf(2));

    }  
}
