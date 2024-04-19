import java.util.Scanner;

import java.lang.Math;

public class armstrong_number {
    public static boolean isarmstrong(int n) {
        int temp, digit = 0, last = 0, sum = 0;
        temp = n;
        while (temp > 0) {
            temp = temp / 10;
            digit++;
        }
        temp = n;
        while (temp > 0) {
            temp = temp % 10;
            sum += (Math.pow(last, digit));
            temp = temp / 10;
        }
        if (n == sum) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
        armstrong_number a=new armstrong_number();
        a.isarmstrong(500);
    }
}
