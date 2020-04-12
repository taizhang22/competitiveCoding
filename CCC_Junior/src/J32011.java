import java.util.Scanner;
import java.io.*;
import java.util.*;
public class J32011 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        System.out.println(sumac(n1, n2, 2));



    }

    public static int sumac(int n1, int n2, int count){
        if (n1 < n2){
            return count;
        } else {
            count = sumac(n2, n1-n2, count++) + 1;
        }
        return count;

    }
}
