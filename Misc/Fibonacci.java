import java.util.Scanner;
import java.io.*;
import java.util.*;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fib = scan.nextInt();
        System.out.println(fib(fib));

    }

    public static int fib (int fib){

        int f[] = new int[fib+2]; // 1 extra to handle case, n = 0

        f[0] = 0;
        f[1] = 1;

        for(int i = 2; i < fib+2; i++){
            f[i] = f[i-1] + f[i-2];
        }

        return f[fib];
    }


}

//accept integer, return the reverse of the input.