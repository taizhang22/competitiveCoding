import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S32012 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;
        int min = -1;

        int countermax = 0;
        int countermin = 0;
        int templow = 0;
        int temphigh = 0;


        int[] read = new int[1001];

        int coremax = 0;
        int coremin = read.length;

        int champlow;

        for(int i = 0; i < read.length; i++){
            read[i] = 0;
        }

        int N = readInt();
        //put into the method
        for(int i = 0; i < N; i++){
            int temp = readInt();
            read[temp] = read[temp]+1;
        }

        //first find the max
        for(int i = 0; i < read.length; i++){
            if(read[i] >= max){
                coremax = i;
                max = read[i];

            }
        }
        //find the min
        for(int i = 0; i < read.length; i++){
            if((read[i]) < max && (read[i] >= min)){
                coremin = i;
                min = read[i];

            }
        }
        //System.out.println("The max value is " + coremax);
        //System.out.println("The min value is " + coremin);
        //System.out.println("The absolute max value is " + max);
        //System.out.println("The absolute min value is " + min);

        //find the # of max/min
        for(int i = read.length-1; i >= 0; i--){
            if(read[i] == max){
                countermax++;
                if(countermax == 2){
                    break;
                }
            }
            if(read[i] == min){
                countermin++;
            }
        }
        //System.out.println("i found this many max" + countermax);
        //System.out.println("i found this many min" + countermin);

        //if theres 2 max
        if(countermax == 2){
            for(int i = 0; i < read.length; i++){
                if(read[i] == max){
                    System.out.println(Math.abs(coremax - i));
                    break;
                }
            }
            //if theres 2 min
        } else if(countermin > 1){
                for(int i = 0; i < read.length; i++){
                    if(read[i] == min){
                        temphigh = i;
                    }
                }

                for(int i = read.length-1; i > 0; i--){
                    if(read[i] == min){
                        templow = i;
                    }
                }

                System.out.println(Math.max(Math.abs(coremax - temphigh),Math.abs(coremax-templow)));
        } else {
            System.out.println(Math.abs((coremax-coremin)));
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
