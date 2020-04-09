import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CCC_2016S1 {

    private static BufferedReader br;
    private static PrintWriter out;
    private static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));


        //Good luck. Don't give up. Try and try again.


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
