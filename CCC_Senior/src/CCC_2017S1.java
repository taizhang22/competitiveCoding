import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class CCC_2017S1 {

    private static BufferedReader br;
    private static PrintWriter out;
    private static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));


        int days = Integer.parseInt(br.readLine());
        String[] Sw = br.readLine().split(" ");
        String[] Se = br.readLine().split(" ");
        int[] swift = new int[days];
        int[] sema = new int[days];
        int swift1 = 0;
        int sema1 = 0;
        int oof = 0;

        int i;
        for(i = 0; i < days; ++i) {
            swift[i] = Integer.parseInt(Sw[i]);
            sema[i] = Integer.parseInt(Se[i]);
        }

        for(i = 0; i < days; ++i) {
            swift1 += swift[i];
            sema1 += sema[i];
            if (swift1 == sema1) {
                oof = i + 1;
            }
        }

        if (oof == 0) {
            System.out.println(0);
        } else {
            System.out.println(oof);
        }


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
