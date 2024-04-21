import java.util.*;
public class array_2d_scanner {
    public static void main(String[] args) {
        int x=0;
        int y=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of row for the matrix");
        x=sc.nextInt();
        System.out.println("enter the number of column for matrix");
        y=sc.nextInt();
        int arr[][]=new int[x][y];
        System.out.println("enter the element of array");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("elements of array are");
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
