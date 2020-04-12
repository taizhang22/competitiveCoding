import java.util.Scanner;
import java.io.*;
import java.util.*;


public class J52011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        int net = scan.nextInt();
        int[] people = new int[net-1];

        for(int i = 0; i < net-1; i++){
            people[i] = scan.nextInt();
            System.out.println(people[i]);
        }
        people[people.length-1] = 10;

        for(int p = 0; p < people.length; p++){
            System.out.println(people[p]);
        }
            */
        int[]h1 = {3,2,1,1,1};
        int[]h2 = {4,3,2};
        int[]h3 = {1,1,4,1};

        System.out.println(equalStacks(h1,h2,h3));

    }

    static int equalStacks(int[] h1, int[] h2, int[] h3) {
        int total1 = 0;
        int total2 = 0;
        int total3 = 0;

        ArrayList<Integer> t1 = new ArrayList<>();
        ArrayList<Integer> t2 = new ArrayList<>();
        ArrayList<Integer> t3 = new ArrayList<>();

        for(int i = 0; i < h1.length; i++){
            t1.add(h1[i]);
            total1 += h1[i];
        }
        for(int i = 0; i < h2.length; i++){
            t2.add(h2[i]);
            total2 += h2[i];
        }
        for(int i = 0; i < h3.length; i++){
            t3.add(h3[i]);
            total3 += h3[i];
        }

        while((total1 != 0) && (total2 != 0) && (total3 != 0)){

            if((total1 == total2)&&(total2 == total3)){
                return total1;
            }

            if((total1 >= total2)&&(total1 >= total3)){
                total1 -= t1.get(0);
                t1.remove(0);
                if((total1 == total2)&&(total2 == total3)){
                    return total1;
                }
            }

            if((total2 >= total1)&&(total2 >= total3)){
                total2 -= t2.get(0);
                t2.remove(0);
                if((total2 == total3)&&(total2 == total1)){
                    return total2;
                }
            }

            if((total3 >= total1)&&(total3 >= total2)){
                total3 -= t3.get(0);
                t3.remove(0);
                if((total2 == total3)&&(total2 == total1)){
                    return total3;
                }
            }


        }

        return 0;
    }


}

//2005 J5
