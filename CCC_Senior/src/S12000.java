import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S12000 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));


                int brokeaf = readInt();
                int machine1 = readInt();
                int machine2 = readInt();
                int machine3 =  readInt();
                int getplayed = 0;

                while (true){
                    machine1++;
                    brokeaf--;
                    if (machine1 == 35){
                        brokeaf +=30;
                        machine1 = 0;
                        getplayed++;
                    } else {
                        getplayed++;
                    }
                    if (brokeaf == 0){
                        break;
                    }

                    machine2++;
                    brokeaf--;
                    if (machine2 == 100){
                        brokeaf +=60;
                        machine2 = 0;
                        getplayed++;
                    } else {
                        getplayed++;
                    }
                    if (brokeaf == 0){
                        break;
                    }

                    machine3++;
                    brokeaf--;
                    if (machine3 == 10){
                        brokeaf +=9;
                        machine3 = 0;
                        getplayed++;
                    } else {
                        getplayed++;
                    }
                    if (brokeaf == 0){
                        break;
                    }

                }

                System.out.println("Martha plays " + getplayed + " before going broke.");

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
