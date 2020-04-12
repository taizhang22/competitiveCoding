/*
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class S32017 {

    static BufferedReader br;
    static PrintWriter out;
    static StringTokenizer st;


    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));



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

// link to problem description: http://www.cemc.uwaterloo.ca/contests/computing/2017/stage%201/seniorEF.pdf
*/

import java.util.*;

public class S32017 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //takes in the amount of boards
        int n = Integer.parseInt(reader.nextLine());


        //takes in the board numbers and puts it in a string array
        String input = reader.nextLine();
        String[] inputs = input.trim().split(" ");

        //takes in the board numbers and puts it in a string array
        int[] lengths = new int[n];
        for (int a = 0; a < n; a++) {
            lengths[a] = Integer.parseInt(inputs[a]);   // by now, array "lengths" has all input board lengths
        }


        //sort by histogram
        int[] sorted = sortIntoHistogram(lengths);
        int countOfMax = 0;
        int testMax = 0;
        int maxLength = 0;

        for (int a = 2; a <= 4000; a++) {
            testMax = findMaxLengthAtHeight(a, sorted);
            if (testMax > maxLength) {
                maxLength = testMax;
                countOfMax = 1;
            } else if (testMax == maxLength) {
                countOfMax++;
            }
        }

        System.out.println(maxLength + " " + countOfMax);
    }

    public static int findMaxLengthAtHeight(int height, int[] boardsOriginal) {
        int board1 = Math.max(1, height - 2000);    // sets lower bound for board1
        int board2 = height - board1;               // sets upper bound for board2 relative to board1

        int[] boards = new int[boardsOriginal.length];
        System.arraycopy(boardsOriginal, 0, boards, 0, boardsOriginal.length);

        int t1 = 0;
        int t2 = 0;
        int boardsMakeable = 0;
        int buffer = 0;

        try {
            while (board1 <= height / 2) {
                //while (t2 != Math.max(1, height - 2000)) {
                t1 = boards[board1];
                t2 = boards[board2];

                if (board1 == board2) {
                    boardsMakeable += t1 / 2;
                    boards[board1] -= t1;
                } else {
                    buffer = Math.min(t1, t2);
                    boards[board1] -= buffer;
                    boards[board2] -= buffer;
                    boardsMakeable += buffer;
                }

                board1++;
                board2--;
            }
        } catch (Exception e) {

        }

        return boardsMakeable;
    }


    public static int[] sortIntoHistogram(int[] numbers) {
        int[] sorted = new int[2001];
        Arrays.fill(sorted, 0);

        for (int number : numbers) {
            sorted[number] += 1;
        }

        return sorted;
    }

    public static boolean arrayContains(int a, int[] array) {
        for (int i : array) {
            if (i == a) {
                return true;
            }
        }

        return false;
    }
}
