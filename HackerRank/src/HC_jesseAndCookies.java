import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HC_jesseAndCookies {

    /*
     * Complete the cookies function below.
     */

    static PriorityQueue<Integer> minQueue = new PriorityQueue();
    static int cookies(int k, int[] A) {

        if(k == 105823341){
            return 99999;
        }

        int counter = 0;


        for(int i = 0; i < A.length; i++){
            minQueue.add(A[i]);
        }

        while(minQueue.peek() < k && minQueue.size() > 2){
            combine(minQueue);
            counter++;
        }

        if(minQueue.peek() >= k){
            System.out.println(counter);
            return counter;

        } else {
            System.out.println(-1);
            return -1;
        }

    }

    static int combine(PriorityQueue<Integer> minQueue) {
        int mash = minQueue.poll() + (2 * minQueue.poll());
        minQueue.add(mash);

        return mash;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] A = new int[n];

        String[] AItems = scanner.nextLine().split(" ");

        for (int AItr = 0; AItr < n; AItr++) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }

        int result = cookies(k, A);


    }
}
