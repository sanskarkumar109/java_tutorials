import java.util.*;

public class duplicte {
    int arr[] = new int[5];

    public void input() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the elemets of the array : ");
            Scanner sc = new Scanner(System.in);
            arr[i] = sc.nextInt();
        }
    }

    public void output() {
        System.out.println("elemets of array are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("length of array is : " + arr.length);
    }

    public void isduplicate() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i]) {
                break;
            }
        }
        System.out.println("the array conatins duplicate element");

    }

    public static void main(String[] args) {
        duplicte d = new duplicte();
        d.input();
        d.output();
        d.isduplicate();
    }

}
