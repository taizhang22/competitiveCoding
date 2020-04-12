import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S22003 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int num = readInt();
        String ans[] = new String[num];

        for(int i = 0; i < num; i++){
            String one = readLine();
            String two = readLine();
            String three = readLine();
            String four = readLine();

            String rone = getRhyme(one);
            String rtwo = getRhyme(two);
            String rthree = getRhyme(three);
            String rfour = getRhyme(four);

            if(rone.equals(rtwo) && rthree.equals(rfour)){
                if(rtwo.equals(rthree)){
                    ans[i] = "perfect";
                    continue;
                } else {
                    ans[i] = "even";
                    continue;
                }
            }

            if(rone.equals(rthree) && rtwo.equals(rfour)){
                ans[i] = "cross";
                continue;
            }

            if(rone.equals(rfour) && rtwo.equals(rthree)) {
                ans[i] = "shell";
                continue;
            }
            ans[i] = "free";
        }

        for(String s : ans){
            System.out.println(s);
        }



    }

    public static String getRhyme(String line){
        String syllable = "";

        String split[] = line.split(" ");
        String last = split[split.length-1].toLowerCase();
        if(last.equals(""))
            last = split[split.length-2].toLowerCase();

        if(vowel(last)){
            for(int i = last.length()-1; i >= 0; i--){
                String check = Character.toString(last.charAt(i));
                if(vowel(check)){
                    syllable = last.substring(i);
                    break;
                }

            }
        } else {
            syllable = last;
        }
        return syllable;
    }

    public static boolean vowel(String word){
        if(word.contains("a"))
            return true;
        if(word.contains("e"))
            return true;
        if(word.contains("i"))
            return true;
        if(word.contains("o"))
            return true;
        if(word.contains("u"))
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
