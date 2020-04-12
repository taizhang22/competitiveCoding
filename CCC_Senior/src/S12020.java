import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S12020 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int num = readInt();

        HashMap<Double, Double> test = new HashMap<Double,Double>();

        double max = 0;

        double may;

        double bruh;

        double distance;
        double time;

        double[] arr = new double[num];

        for (int i = 0; i < num; i++){

            bruh = readDouble();
            test.put(bruh, readDouble());
            arr[i] = bruh;
        }

        Arrays.sort(arr);


        for(int j = 0; j < arr.length-1; j++){
            distance = Math.abs(test.get(arr[j+1]) - test.get(arr[j]));
            time = arr[j+1] - arr[j];
            may = distance/time;


            if(may > max)
                max = may;
        }

        System.out.println(max);


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
