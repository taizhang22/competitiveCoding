import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S12005 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));


        int n = readInt();
        for (int x = 0; x < n; x++) {
            String s = readLine();
            String sf = "";
            for (int y = 0; y < s.length() && sf.length() < 10; y++) {
                char c = s.charAt(y);
                if (c - 'A' >= 0 && c - 'A' <= 2)
                    sf += "2";
                else if (c - 'D' >= 0 && c - 'D' <= 2)
                    sf += "3";
                else if (c - 'G' >= 0 && c - 'G' <= 2)
                    sf += "4";
                else if (c - 'J' >= 0 && c - 'J' <= 2)
                    sf += "5";
                else if (c - 'M' >= 0 && c - 'M' <= 2)
                    sf += "6";
                else if (c - 'P' >= 0 && c - 'P' <= 3)
                    sf += "7";
                else if (c - 'T' >= 0 && c - 'T' <= 2)
                    sf += "8";
                else if (c - 'W' >= 0 && c - 'W' <= 3)
                    sf += "9";
                else if (c != '-')
                    sf += c;
            }
            System.out.println(sf.substring(0, 3) + "-" + sf.substring(3, 6) + "-" + sf.substring(6));
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
