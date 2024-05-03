import java.util.*;
public class factorial_using_recursion {
    public static int factorial(int n){
        if(n==0){
            return 1;
    }
    else{
        return n*factorial(n-1);
    }
}
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number for factorial : ");
        num=sc.nextInt();
        int fact=factorial(num);
        System.out.println("factorial of " + num + " : "+fact);
    }
}
