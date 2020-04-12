import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    public static ArrayList<Integer> factor = new ArrayList<Integer>();

    public static int[][] map;

    public static int[][] been;

    public static int Mrows;
    public static int Ncolumns;

    public static boolean done = false;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        Mrows = readInt();

        Ncolumns = readInt();

        map = new int[Mrows+1][Ncolumns+1];

        been = new int[Mrows+1][Ncolumns+1];


        for(int i = 1; i < map.length; i++){
            for(int j = 1; j < map[0].length; j++){

                if((i == 1) && (j == 1)){
                    int first = readInt();
                    map[1][1] = first;
                } else {
                    map[i][j] = readInt();
                    been[i][j] = -1;
                }


            }
        }

        for(int i = 0; i < been.length; i++){
            for(int j = 0; j < been[0].length; j++){
                been[i][j] = -1;
            }
        }

        for(int i = 0; i < been.length; i++){

            for(int j = 0; j < been[0].length; j++){

            }
        }

        factor = fac(map[1][1]);
        been[1][1] = 0;

        if(factor.size()%2 == 0){
            for(int i = 0; i < factor.size()/2; i++){
                jump(factor.get(i), factor.get(factor.size()-i-1));
                jump(factor.get(factor.size()-i-1), factor.get(i));
            }
        } else {
            for(int i = 0; i < (factor.size()-1)/2; i++){
                jump(factor.get(i), factor.get(factor.size()-i-1));
                jump(factor.get(factor.size()-i-1),factor.get(i));

            }
            jump((factor.get(factor.size()-1)/2), (factor.get(factor.size()-1)/2));
        }

        /*
        for(int i = 0; i < factor.size(); i++){
            System.out.println(factor.get(i));
        }*/





        if(!done)
            System.out.println("no");
    }

    public static ArrayList<Integer> fac(int f){
        ArrayList<Integer> yee = new ArrayList<Integer>();
        for(int i = 1; i <= Math.min(f, 1001); i++){
            if(f%i == 0){
                yee.add(i);
            }
        }
        return yee;
    }

    public static void jump(int m, int n) {
        if(m <= Mrows && n <= Ncolumns){
        int REE = been[m][n];
        if (REE == 0 || done)
            return;

        been[m][n] = 0;
        ArrayList<Integer> pos = fac(map[m][n]);
        if (pos.size() % 2 == 0) {
            for (int i = 0; i < (pos.size()/2); i++) {
                jump(pos.get(i), pos.get(pos.size() - i-1));
                jump(pos.get(pos.size() - i-1), pos.get(i));
            }
        } else if(pos.size() == 1) {
            jump(1,1);
        } else {
            for (int i = 0; i < (pos.size() - 1) / 2; i++) {
                jump(pos.get(i), pos.get(pos.size() - i-1));
                jump(pos.get(pos.size() - i-1), pos.get(i));
            }
         jump((pos.get(pos.size()-1)/2), (pos.get(pos.size()-1)/2));
        }

        if (been[Mrows][Ncolumns] != -1 && !done) {
            System.out.println("yes");
            done = true;

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
