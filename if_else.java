import java.util.*;
public class if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float age;
        System.out.println("enter your age for confirmation that you can drive or not");
        age=sc.nextFloat();
        if(age>18){
            System.out.println("you can drive ");
        }
        else if(age==18){
            System.out.println("from next year you can drive");
        }

        else{
            System.out.println("you can not drive");
        }
    }
}
