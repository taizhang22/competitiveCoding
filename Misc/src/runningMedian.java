import java.util.Scanner;
import java.io.*;
import java.util.*;

public class runningMedian {

    public static void addNumber(int number, PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {
        if (lower.size() == 0 || number < lower.peek()) {
            lower.add(number);
        } else {
            higher.add(number);
        }
    }

    public static void rebalance(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {
        PriorityQueue<Integer> biggerHeap = lower.size() > higher.size() ? lower : higher;
        PriorityQueue<Integer> smallerHeap = lower.size() > higher.size() ? higher : lower;

        if (biggerHeap.size() - smallerHeap.size() >= 2) {
            smallerHeap.add(biggerHeap.poll());

        }
    }

    public static double getMedian(PriorityQueue<Integer> lower, PriorityQueue<Integer> higher) {
        PriorityQueue<Integer> biggerHeap = lower.size() > higher.size() ? lower : higher;
        PriorityQueue<Integer> smallerHeap = lower.size() > higher.size() ? higher : lower;
        if (biggerHeap.size() == smallerHeap.size()) {
            return ((double) biggerHeap.peek() + smallerHeap.peek()) / 2;
        } else {
            return biggerHeap.peek();

        }
    }

        public static double getMedians ( int[] array){
            PriorityQueue<Integer> lowers = new PriorityQueue<Integer>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return -1 * o1.compareTo(o2);
                }
            });
            PriorityQueue<Integer> highers = new PriorityQueue<Integer>();
            double medians[] = new double[array.length];

            for (int i = 0; i < array.length; i++) {
                int number = array[i];
                addNumber(number, lowers, highers);
                rebalance(lowers, highers);
                medians[i] = getMedian(lowers, highers);
            }
            return medians[0];
        }


        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);


        }


    }

