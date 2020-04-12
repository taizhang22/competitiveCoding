import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S12004 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        for (int x = readInt(); x > 0; x--) {
            String q = next();
            String w = next();
            String e = next();
            if (start(q, e) || start(q, w) || start(w, e) || compare(q, e) || compare(q, w) || compare(w, e))
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }

    static boolean start(String q, String w) {
        if (q.indexOf(w) == 0 || w.indexOf(q) == 0)
            return true;
        return false;
    }

    static boolean compare(String q, String w) {
        if ((q.indexOf(w) == q.length() - w.length() && q.indexOf(w) >= 0) || (w.indexOf(q) >= 0 && w.length() - q.length() == w.indexOf(q)))
            return true;
        return false;
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
