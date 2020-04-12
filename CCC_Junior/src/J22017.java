import java.util.Scanner;
import java.io.*;
import java.util.*;
public class J22017 {


    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int sum = scan.nextInt();
        int k = scan.nextInt();

        System.out.println(shiftysum(sum, k));


    }

    private static int shiftysum(int sum, int k){
        int total = 0;
        if(k >= 0){
            total = sum + shiftysum(sum*10, k-1);
        } else {
            return 0;
        }

        return total;
    }
}
