import java.util.*;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("enter a number");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println(num+" is a even number ");

        }
        else{
            System.out.println(num+" is a odd number");
        }
        
    }
}
