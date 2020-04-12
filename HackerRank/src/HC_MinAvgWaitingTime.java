import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HC_MinAvgWaitingTime {

    /*
     * Complete the minimumAverage function below.
     */
    static int minimumAverage(int[][] customers) {

        return 8008135;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int numofCustomers = 0;
    }

    static class Customer implements Comparable<Customer> {

        int orderTime;
        int cookTime;

        public Customer (int orderTime, int cookTime){
            this.orderTime = orderTime;
            this.cookTime = cookTime;
        }

        @Override
        public int compareTo(Customer a){
            if (this.cookTime  > a.cookTime){
                return this.cookTime;
            } else {
                return -1;
            }

        }

    }
}
