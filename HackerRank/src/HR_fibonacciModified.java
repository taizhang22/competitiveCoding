import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class HR_fibonacciModified {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int n1 = readInt();
        int n2 = readInt();

        int n = readInt();

        System.out.println(fib(n1, n2, n));

    }

    public static BigInteger fib (int n1, int n2, int fib){

        BigInteger f[] = new BigInteger[fib+2]; // 1 extra to handle case, n = 0

        f[0] = BigInteger.valueOf(n1);
        f[1] = BigInteger.valueOf(n2);

        for(int i = 2; i < fib+2; i++){
            f[i] = f[i-2].add(f[i-1].multiply(f[i-1]));
        }

        return f[fib-1];
    }


    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }

}
