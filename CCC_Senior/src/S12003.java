import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S12003 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int moves = readInt();
        int square = 1;

        while(moves != 0){

            if(square + moves < 100){
                square += moves;
            } else {
                if(square + moves == 100){
                    System.out.println("You are now on square 100");
                    System.out.println("You Win!");
                    break;
                } else {
                    System.out.println("You are now on square " + square);
                    moves = readInt();
                    continue;
                }
            }


        switch (square){

                case 9:
                    square = 34;
                    break;
                case 40:
                    square = 64;
                    break;
                case 67:
                    square = 86;
                    break;
                case 99:
                    square = 77;
                    break;
                case 90:
                    square = 48;
                    break;
                case 54:
                    square = 19;
                    break;

            }

            System.out.println("You are now on square " + square);
            moves = readInt();
        }

        if(moves == 0){
            System.out.println("You Quit!");
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
