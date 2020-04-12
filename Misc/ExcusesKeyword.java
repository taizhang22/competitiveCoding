import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExcusesKeyword {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    static int keyword;
    static int excuse;

    static ArrayList excuses = new ArrayList<String>();
    static int top[];
    static HashSet<String> keywords = new HashSet<String>();
    static ArrayList best = new ArrayList<Integer>();

    static TreeSet<String> sort = new TreeSet<String>();



    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        keyword = readInt();
        excuse = readInt();

        for(int i = 0; i < keyword; i++){
            keywords.add(readLine());
        }

        for(int i = 0; i < excuse; i++){
            excuses.add(readLine());
        }

        top = new int[excuse];

        for(int i = 0; i < excuses.size(); i++){
            top[i] = countExcuses(keywords, excuses.get(i));
        }

        int maxNum = 0;

        for(int a : top){
            if(a > maxNum){
                maxNum = a;
            }
        }

        for(int q = 0; q < top.length; q++){
            if(top[q] == maxNum){
                best.add(q);
            }
        }

        for(int i = 0 ; i < best.size(); i++){
            System.out.println(excuses.get((int)best.get(i)));
            sort.add((String)excuses.get((int)best.get(i)));
        }

        System.out.println("In order: ");

        for(String a : sort){
            System.out.println(a);
        }






        //Good luck. Don't give up. Try and try again.

    }

    static int countExcuses(HashSet keywords, Object str){
        int total = 0;

        String arr[] = ((String) str).split(" ");
        for(int i = 0; i < arr.length; i++){
            for(Object p : keywords){
                if(arr[i].equals(p))
                    total++;
            }
        }
        System.out.println("Found " + total + " excuses");
        return total;
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
