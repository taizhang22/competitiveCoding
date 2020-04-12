import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HR_Equal {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int cases = readInt();

        int cookies = readInt();

        int[] arr = new int[cookies];

        for(int i = 0; i < cookies; i++){
            arr[i] = readInt();
        }

        for(int i = cases; i > 0; i--){
            System.out.println(minCounts(arr));
        }

    }

    public static int minCounts(int[] cookies){
        Arrays.sort(cookies);
        int minVal = cookies[0];
        int min = Integer.MAX_VALUE;

        for(int base = 0; base < 3; base++) {
            int current_sum = 0;
            for(int i = 0; i < cookies.length; i++) {
                int delta = cookies[i] - cookies[0] + base;
                current_sum += (int)delta / 5 + delta % 5 / 2 + (delta % 5 %(2 / 1));
            }
            min = Math.min(current_sum,min);
        }

        return min;


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
