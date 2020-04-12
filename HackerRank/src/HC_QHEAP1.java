import java.util.Scanner;
import java.io.*;
import java.util.*;

public class HC_QHEAP1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
        int queries = scan.nextInt();

        for(int i = 0; i < queries; i++){
            int next = scan.nextInt();

            switch(next) {
                case 1:
                    heap.add(scan.nextInt());
                    break;

                case 2:
                    heap.remove(scan.nextInt());
                    break;

                case 3:
                    System.out.println(heap.peek());
                    break;
            }

        }


    }


}
