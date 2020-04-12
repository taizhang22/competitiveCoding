import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S12006 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        String pool[] = new String[5];

        String p1 = readLine();
        String p2 = readLine();
        int babies = readInt();
        boolean allgood = true;

        for(int i = 0; i < 5; i++){
            pool[i]= p1.substring(2*i,2*i+2)+ p2.substring(2*i,2*i+2);
        }


        for(int i = 0; i < babies; i++){
            String baby = readLine();
            char[] arr = baby.toCharArray();

            for(int p = 0; p < 5; p++){
                if((int)arr[p] < 95){ if(pool[p].contains("" + arr[p])){
                        continue;
                    } else {
                        System.out.println("Not their baby!");
                        allgood = false;
                        break;
                    }
                }
                if(!((pool[p].charAt(1) == arr[p]) && (pool[p].charAt(3) == arr[p]))){
                    System.out.println("Not their baby!");
                    allgood = false;
                    break;
                }
            }
            if(allgood){
                System.out.println("Possible baby.");
            } else {
                allgood = true;
            }
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
