import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S32003 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;

    private static char[][] plan;
    private static ArrayList<Integer> roomSizes = new ArrayList<Integer>();
    private static int rooms = 0;
    private static int rows;
    private static int cols;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));

        int flooring = readInt();
        rows = readInt();
        cols = readInt();
        plan = new char[rows][];
        for(int i = 0; i < rows; i++){
            plan[i] = readLine().toCharArray();
        }

        for(int i = 0; i < plan.length; i++){
            for(int j = 0; j < plan[0].length; j++){
                if(plan[i][j] == '.'){
                    roomSizes.add(floodRoom(i,j,0));
                }
            }
        }

        Collections.sort(roomSizes);

        for(int i = roomSizes.size()-1; i >= 0; i--){
            if(flooring - roomSizes.get(i) >= 0){
                flooring -= roomSizes.get(i);
                rooms++;
            } else {
                break;
            }

        }

        System.out.println((rooms == 1 ? "1 room, " : rooms + " rooms, ") + flooring + " square metre(s) left over");
    }

    private static int floodRoom(int row, int col, int count){
        if(row >= 0 && row < rows && col >= 0 && col < cols && (plan[row][col] == '.')){
            plan[row][col] = 'X';
            count++;

            count = floodRoom(row, col - 1, count);
            count = floodRoom(row, col + 1, count);
            count = floodRoom(row - 1, col, count);
            count = floodRoom(row + 1, col, count);

        }

        return count;
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
