import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S32014B {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int a = readInt();

        for(int q = 0; q < a; q++){

        int t = readInt();
        Stack<Integer> top = new Stack<Integer>();
        Stack<Integer> branch = new Stack<Integer>();

        int counter = 1;
        top.push(0);
        branch.push(0);

        for(int i = 0; i < t; i++){
            top.push(readInt());
        }

        boolean remind = true;

        while (counter <= t){
            if(top.peek() == counter){
                top.pop(); counter++;
                continue;
            }

            if(branch.peek() == counter) {
                branch.pop();
                counter++;
                continue;
            }

            if(top.peek() == 0){
                remind = false;
                break;
            }

            branch.push(top.pop());

        }

        System.out.println(remind ? "Y" : "N");


        //Good luck. Don't give up. Try and try again.
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
