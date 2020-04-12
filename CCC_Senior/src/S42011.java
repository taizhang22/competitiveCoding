import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S42011 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    private static int[] has = new int[8];
    private static int[] needs = new int[8];

    private static int[] althas = new int[8];
    private static int[] altneeds = new int[8];


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        //O- O+ A- A+ B- B+ AB- AB+
        //0  1  2  3  4  5  6   7
        int total0 = 0;
        int totala = 0;
        int totalb = 0;

        for(int i = 0; i < 8; i++){
            has[i] = readInt();
        }

        for(int j = 0; j < 8; j++){
            needs[j] = readInt();
        }

        //get O- blood and O+ blood;
        total0 += use(0,0) + use(1,1) + use(0,1);
        //get A- blood and B- blood; **order in scarcity
        total0 += use(2,2) + + use(4,4) + use(0,4) + use(0,2);

        althas = Arrays.copyOf(has, 8);
        altneeds = Arrays.copyOf(needs, 8);


        //Test for A Blood first **remember scarcity
        totala += use(3, 3) + use(5,5) + use(2,3)+ use(4,5) + use(1, 3) +use(1, 5) + use(0, 3) + use(0,5);
        //Add on AB- and AB+
        totala += use(6,6) + use(4,6) + use (2,6) + use(0,6);
        totala += use(7,7) + use(6,7) + use(5,7) + use(4,7) + use(3,7) + use(2,7) + use(1,7) + use(0,7);


        has = Arrays.copyOf(althas, 8);
        needs = Arrays.copyOf(altneeds, 8);


        //Test for B Blood first
        totalb += use(5,5) + use(3, 3) +use(1, 5) + use(1, 3) + use(0,5) + use(0, 3) ;
        //Add on AB- and AB+
        totalb += use(6,6) + use(4,6) + use (2,6) + use(0,6);
        totalb += use(7,7) + use(6,7) + use(5,7) + use(4,7) + use(3,7) + use(2,7) + use(1,7) + use(0,7);


        System.out.println(total0 + Math.max(totala, totalb));




    }

    public static int use(int x, int y){
        int all = Math.min(has[x], needs[y]);

        has[x] -= all;
        needs[y] -= all;

        return all;
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
