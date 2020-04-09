import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CCC_2018S1 {

    private static BufferedReader br;
    private static PrintWriter out;
    private static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int villages = readInt();
        double lowest = 2.0E9D;
        double[] arr = new double[villages];

        int i;
        for(i = 0; i < villages; ++i) {
            arr[i] = readDouble();
        }

        Arrays.sort(arr);

        for(i = 0; i < villages - 2; ++i) {
            double temp = (arr[i + 2] - arr[i]) / 2.0D;
            if (temp < lowest) {
                lowest = temp;
            }
        }

        System.out.printf("%.1f", lowest);
    }


    private static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    private static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    private static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    private static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    private static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    private static String readLine() throws IOException {
        return br.readLine().trim();
    }

}
