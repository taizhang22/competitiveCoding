import java.util.Scanner;
import java.io.*;
import java.util.*;

public class ReverseInt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//accept integer, return the reverse of the input.
        double rev = scan.nextInt();
        int count = 0;
        double dupe = rev;
        while(dupe > 10){
            dupe/=10;
            count++;
            System.out.println("count is " + count);
        }


        System.out.println(reverse(rev, count));
        // 1 2 3
    }
    public static double reverse (double rev, int count){
        if (rev < 10) {
            return rev;

        }
        else {
            System.out.println(rev%10 * Math.pow(10,count));
            System.out.println((rev - rev%10) / Math.pow(10,count));
            return rev%10 * Math.pow(10,count) + reverse(rev - rev%10, count--);
        }
    }


}

//function with 2 inputs, returning the largest common factor