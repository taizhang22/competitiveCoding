import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S42014 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        //I am creating 2 maps to store the coordinates, and the index at a coord.
        HashMap<Integer, Integer> coords = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();

        int n = readInt();
        int threshold = readInt();

        //a queue that prioritizes coordinates based on the compareTo.
        PriorityQueue<Event> pq = new PriorityQueue<Event>();

        TreeSet<Integer> treeset = new TreeSet<Integer>();

        for(int i = 0; i < n; i++){
            //receiving the coords for the tinted glass
            int x1 = readInt();
            int y1 = readInt();
            int x2 = readInt();
            int y2 = readInt();
            int t = readInt();

            //adds to the priorityqueue the first x coord with positive threshhold and also one with negative threshhold.
            pq.offer(new Event(x1, y1, y2, t));
            pq.offer(new Event(x2, y1, y2, -t));

            treeset.add(y1);
            treeset.add(y2);
        }

        int count = 1;
        //iterates between all the y values in the sorted tree.
        for(Integer i: treeset){
            //adds a key of the y1/y2, corresponding to the count value.
            index.put(i, count);
            //adds a key of the count value, corresponding to the y integer value.
            coords.put(count, i);
            count++;
        }

        // heavily simplifies the graph by
        long[] line = new long[count + 1];
        long total = 0;
        long lastx = Integer.MIN_VALUE;

        //while the pq has a value, taking out an event, take its x value.
        while (!pq.isEmpty()) {
            Event curr = pq.poll();
            long currx = curr.x;
            long currTotal = 0;
            //for the amount of counts (amount of integer i in the treeset, count++
            for(int x = 0; x < count; x++){
                currTotal += line[x];
                //if its a valid x, and the currtotal is bigger than threshold, add to total.
                if(lastx != Integer.MIN_VALUE && currTotal >= threshold && x != count - 1){
                    total += (currx - lastx) * ((long)coords.get(x+1) - (long)coords.get(x));
                }
            }
            //set the last x to the current x
            lastx = currx;
            line[index.get(curr.y1)] += curr.t;
            line[index.get(curr.y2)] -= curr.t;
            while(!pq.isEmpty() && pq.peek().x == lastx){
                curr = pq.poll();
                line[index.get(curr.y1)] += curr.t;
                line[index.get(curr.y2)] -= curr.t;
            }
        }

        System.out.println(total);


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

    static class Event implements Comparable<Event>{
        //this creates a coordinate class that reads an x coord, and 2 y coords.
        int x;
        int y1;
        int y2;
        int t;

        Event(int x, int y1, int y2, int t){
            this.x = x;
            this.y1 = y1;
            this.y2 = y2;
            this.t = t;

        }


        //this is here to sort in the priorityqueue.
        @Override
        public int compareTo(Event o) {
            return x - o.x;
        }

    }




}
