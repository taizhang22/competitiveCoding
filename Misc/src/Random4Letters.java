import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Random4Letters {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));


        //Good luck. Don't give up. Try and try again.

        List<String> all = new ArrayList<String>();

        System.out.println(String.valueOf((char)(97+2)) + String.valueOf((char)(97+2)));
        String s = String.valueOf((char)(97+2)) + String.valueOf((char)(97+2));
        System.out.println(s);


        for(int i = 0; i < 10; i++){
            for(int p = 0; p < 10; p++){
                for(int q = 0; q < 10; q++){
                    for(int j = 0; j < 10; j++){
                        String send = String.valueOf((char)(i+97)) + String.valueOf((char)(p+97)) + String.valueOf((char)(q+97)) + String.valueOf((char)(j+97));
                        all.add(send);
                    }
                }
            }


        }

        for(int i = 0; i < all.size(); i++){
            System.out.print(all.get(i) + " ");
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
