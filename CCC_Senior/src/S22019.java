import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S22019 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    static int total;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        total = readInt();

        boolean prime = true;


        for(int i = 0; i < total; i++){
            System.out.println(check(readInt()));
        }



    }

    public static String check(int input){
        boolean prime = true;

        for (int i = 0; i < total-1; i++){

            //first int
            for(int j = 2; j < input; j++){
                //second int
                for(int k = 2*(int)Math.ceil(input)-i; k > 0; k--){

                    //check good choice
                    if(((j + k)/2.0) == (double)input){

                        //check modulus for k
                        for(int p = 2; p <= (int)Math.ceil(Math.sqrt(k)); p++){
                            if(k%p == 0){
                                prime = false;
                                break;
                            }
                        }

                        if(prime){
                            for(int q = 2; q <= (int)Math.ceil(Math.sqrt(j)); q++) {
                                if (j % q == 0) {
                                    prime = false;
                                    break;
                                }
                            }

                            if(prime){
                                return (j + " " + k);
                            } else {
                                prime = true;
                            }

                        }
                        prime = true;

                    }
                }
            }

        }

        return "";
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
