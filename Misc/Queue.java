import java.util.Scanner;
import java.io.*;
import java.util.*;

    public class Queue<N> {
        private ArrayList<Integer> queue;

        public Queue(){
            queue = new ArrayList<Integer>();
        }

        public void addQueue(int n){
            queue.add(n);
        }

        public void removeQueue(){
            queue.remove(0);
        }

        public void displayQueue(){
            if(queue.size() > 0){
                System.out.println(queue.get(queue.size()-1));
            } else {
                System.out.println("Nothing in!");

            }

        }

    }


