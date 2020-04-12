
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S32016 {

    static BufferedReader br;
    static StringTokenizer st;

    static int N, M;
    static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
    static boolean[] isPho;
    static boolean[] isMarked;
    static int[] dist;
    static int totalDist;



    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        //Good luck. Don't give up. Try and try again.

        //taking in the first 2 vals.
        N = readInt();
        M = readInt();


        //setting isPho and isMarked to the amount of restaurants.
        isPho = new boolean[N];
        isMarked = new boolean[N];

        //populating the Arraylist of Arraylists.
        for(int i = 0; i < N; i++){
            adj.add(new ArrayList<Integer>());
        }

        //setting the pho restaurants to true;
        for(int i = 0; i < M; i++){
            isPho[readInt()] = true;
        }

        //linking all the restaurants together.
        for(int i = 0; i < N - 1; i++){
            int a = readInt();
            int b = readInt();

            adj.get(a).add(b);
            adj.get(b).add(a);
        }


        // find a pho restaurant, mark it, and then exit out of the loop.
        for(int i = 0; i < N; i++){
            if(isPho[i]) {
                mark(i, -1);
                break;
            }
        }


        dist = new int[N];
        for(int i = 0; i < N; i++){
            if(isMarked[i]){
                computeDist(i, -1, 0);
                break;
            }
        }


        //Find the max distanced node
        int maxIndex = -1;
        for(int i = 0; i < N; i++){
            if(isMarked[i] && (maxIndex == -1 || (dist[maxIndex] < dist[i])))
                maxIndex = i;
        }

        dist = new int[N];
        computeDist(maxIndex, -1, 0);

        int longestDist = 0;

        for(int i = 0; i < N; i++)
            longestDist = Math.max(longestDist, dist[i]);

        System.out.println(totalDist - longestDist);


    }

    static void mark (int u, int prev){

        //if it is a pho restaurant, mark it as true.
        if(isPho[u])
            isMarked[u] = true;

        //for each adjacent restaurant, if its the same as prev, continue
        for(int v: adj.get(u)){
            if(v == prev)
                continue;
        //else, mark the adjacent restaurant, setting the previous as the one now.
            mark(v,u);

        //if the adjacent is marked, increase the total distance by 2, and mark the current one.
            if(isMarked[v]){
                totalDist += 2;
                isMarked[u] = true;
            }
        }

    }

    //computes the distances from the node using a simple recursive function and a previous int.
    static void computeDist(int u, int prev, int depth){
        dist[u] = depth;
        for (int v: adj.get(u)){
            if(v != prev && isMarked[v]){
                computeDist(v, u, depth + 1);
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