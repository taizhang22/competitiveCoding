import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S32011 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int test = readInt();

        for(int i = 0; i < test; i++){
            System.out.println(isCrystal(readInt(), readInt(), readInt()) ? "crystal" : "empty");
        }

    }

    public static boolean isCrystal(int m, int x, int y){

        int newX = (int)Math.floor(x / (Math.pow(5, m)/5));

        int newY = (int)Math.floor(y / (Math.pow(5, m)/5));

        if((newX > 0 && newX < 4) && newY == 0){
            return true;
        } else if(newX == 2 && newY == 1){
            return true;
        } else if(((newX == 1 || newX == 3) && newY == 1) || (newX == 2 && newY == 2)){
            return isCrystal(m-1, (int)(x % (Math.pow(5, m)/5)),(int)(y % (Math.pow(5, m)/5)));
        }
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
