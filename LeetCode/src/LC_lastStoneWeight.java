import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class LC_lastStoneWeight {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static PriorityQueue<Integer> stone;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        //Good luck. Don't give up. Try and try again.

        int[] arr = {2,7,4,1,8,1};

        System.out.println(lastStoneWeight(arr));


    }

    public static int lastStoneWeight(int[] stones){
        stone = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int a : stones)
            stone.add(a);

        while(stone.size() > 1){
            int a = stone.poll();
            int b = stone.poll();

            if(a == b){
                continue;
            }

            stone.add(Math.abs(a - b));
        }
        if(stone.size() == 1){
            return stone.poll();
        } else {
            return 0;
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
