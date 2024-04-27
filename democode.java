import java.util.*;
public class democode {
    int x,y,r,r1,r2,r3;
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value for x");
        x=sc.nextInt();
        System.out.println("enter the value for y");
        y=sc.nextInt();
    }
    public void calci(){
         r=x*y;
         r1=x+y;
         r2=x/y;
         r3=x%y;
    }
    public void print(){
        System.out.println(r+" "+r1+" "+r2+" "+r3);
    }
    public static void main(String[] args){
        democode dc=new democode();
        dc.input();
        dc.calci();
        dc.print();
    }
    
}
