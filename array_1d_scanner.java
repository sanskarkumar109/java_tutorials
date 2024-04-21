import java.util.*;
public class array_1d_scanner {
    public static void main(String[] args) {
        int arr[];
        arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.println("enter the number at index "+i);
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<=arr.length-1;i++){
        System.out.println("element at index "+i+" is "+arr[i]);
        }
        
    }
    
}
