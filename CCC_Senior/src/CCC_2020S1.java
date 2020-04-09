import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class CCC_2020S1 {
static BufferedReader br;
static PrintWriter out;
static StringTokenizer st;

public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int num = readInt();
        HashMap<Double, Double> test = new HashMap();
        double max = 0.0D;
        double[] arr = new double[num];
        int j;

        for(j = 0; j < num; ++j) {
        double bruh = readDouble();
        test.put(bruh, readDouble());
        arr[j] = bruh;
        }

        Arrays.sort(arr);

        for(j = 0; j < arr.length - 1; ++j) {
        double distance = Math.abs((Double)test.get(arr[j + 1]) - (Double)test.get(arr[j]));
        double time = arr[j + 1] - arr[j];
        double may = distance / time;
        if (may > max)
        max = may;
        }

        System.out.println(max);

        }

static String next() throws IOException {
        while(st == null || !st.hasMoreTokens()) {
        st = new StringTokenizer(br.readLine().trim());
        }

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
