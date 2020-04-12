import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S22012 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

       int output = 0;
       char mem;

        HashMap<Character, Integer> roman = new HashMap<Character,Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        String aro = readLine();
        char[] split = aro.toCharArray();

        output += Character.getNumericValue(split[split.length-2])*roman.get(split[split.length-1]);
        mem = split[split.length-1];

        for(int i = split.length-4; i >= 0; i -= 2){

            if(roman.get(mem) > roman.get(split[i+1])){
                output -= Character.getNumericValue(split[i])*roman.get(split[i+1]);
                mem = split[i+1];

            } else {
                output += Character.getNumericValue(split[i])*roman.get(split[i+1]);
                mem = split[i+1];
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
