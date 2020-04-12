import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S22014 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        //Good luck. Don't give up. Try and try again.

        int n = readInt();

        String[][] names = new String[2][n];

        for(int i = 0; i < 2; i++){
            String[] split = readLine().split(" ");

            for(int k = 0; k < split.length; k++){
                names[i][k] = split[k];
            }
        }


        boolean good = true, keep = true;
        String top, bottom;

        for(int i = 0; i < n && good; i++)
        {
            top = names[0][i];
            bottom = names[1][i];

            for(int j = 0; j < n && keep; j++)
            {
                if(names[1][j].equals(top))
                {
                    if(names[0][j].equals(names[1][j]) || (!names[0][j].equals(bottom)))
                    {
                        good = false;
                        keep = false;
                    }
                }
            }
        }

        if(good)
            System.out.println("good");
        else
            System.out.println("bad");

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
