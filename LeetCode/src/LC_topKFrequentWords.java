import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class LC_topKFrequentWords {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));




        //Good luck. Don't give up. Try and try again.

    }

    public List<String> topKFrequent(String[] words, int k){


        Map<String, Integer> map = new HashMap<>();

        for(String w : words){
            map.put(w, map.getOrDefault(w,0) + 1);
        }

        PriorityQueue<String> nodupes = new PriorityQueue<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(map.get(o1).equals(map.get(o2))){
                    return o1.compareTo(o2);
                }
                return (map.get(o1) - map.get(o2));
            }
        });

        nodupes.addAll(map.keySet());
        for(int i = 0; i < k; i++){
            if (!nodupes.isEmpty()){

            }
        }

        return (List<String>) nodupes;
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
