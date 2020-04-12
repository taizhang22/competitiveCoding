import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S22008 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    static int other;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int radius = readInt();

        while(radius != 0){

            other = 0;

            for (int i = 1; i <= radius; i++) {
                double point = Math.floor(Math.sqrt( (radius * radius) - (i * i) ));

                if (point <= radius)
                    other += point + 1;
            }

            System.out.println(other * 4 + 1);
            radius = readInt();
        }

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
