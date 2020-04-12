import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S22000 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Double> a = new ArrayList<Double>();

        for (int x = readInt(); x > 0; x--)
            a.add(readInt()*1.0);
        int reg = readInt();

        while (reg != 77) {
            if (reg == 99) {
                int index = readInt() - 1;
                int percent = readInt();
                a.add(index + 1, (Double)(a.get(index) * ((100.0 - percent)) / 100.0));
                a.set(index, (Double)(a.get(index) * (percent / 100.0)));
            } else {
                int index = readInt() - 1;
                a.set(index, a.get(index) + a.get(index + 1));
                a.remove(index + 1);
            }
            reg = readInt();
        }
        for (reg = 0; reg < a.size(); reg++) {
            System.out.print(Math.round(a.get(reg)) + " ");
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
