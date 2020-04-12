import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S22006 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;




    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        String output = "";
        Map<Character, Character> map = new HashMap<Character, Character>();

        String plain = readLine();
        String key = readLine();
        String decode = readLine();

        for(int i = 0; i < plain.length(); i++){
            map.put(key.charAt(i),plain.charAt(i));
        }

        for(int p = 0; p < decode.length(); p++){
            if(map.containsKey(decode.charAt(p))){
                output = output + map.get(decode.charAt(p));
            } else {
                output = output + ".";
            }

        }

        System.out.println(output);


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
