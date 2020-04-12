import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S12008 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));


        Scanner scan = new Scanner(System.in);
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

/*
String cities[] = new String[10000];

        int arr[] = new int[10000];

        String city = scan.next();
        cities[0] = city;

        int temp = scan.nextInt();
        arr[0] = temp;

        int tops = 201;
        int corre = 0;

        for (int i = 1; i < 10000; i++){
                cities[i] = city;
                arr[i] = temp;

                if(arr[i] < tops){
                    tops = arr[i];
                    corre = i;
                }

                if (city.equals("Waterloo")){
                    break;
            }

            city = scan.next();
            temp = scan.nextInt();


        }

        System.out.println(cities[corre]);
 */