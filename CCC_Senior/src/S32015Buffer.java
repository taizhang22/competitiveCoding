import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S32015Buffer {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;
        boolean fail = false;
        int g = readInt();
        int p = readInt();

        TreeSet<Integer> tree = new TreeSet<Integer>();

        for(int i = 1; i <= g; i++){
            tree.add(i);
        }

        for(int j = 0; j < p; j++){
            //get the plane integer, and floor it.
            int plane = readInt();
            Integer i = tree.floor(plane);

            //as long as gate "exists" and it didnt fail previously
            if(i != null && !fail){
                tree.remove(i);
                count++;
            } else {
                fail = true;
            }
        }

        System.out.println(count);

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
