import java.util.Scanner;
import java.io.*;
import java.util.*;

public class primeCheck {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> sieve = new ArrayList<Integer>();

        System.out.println("What number to check?");

        int num = scan.nextInt();

        for(int i = 2; i <= num; i++){
            sieve.add(i);
        }

        while((sieve.size() != 1)){
            int remove = sieve.get(0);
            for(int i = 0; i < sieve.size(); i++){
                if(sieve.get(i)%remove == 0 ){
                    sieve.remove(i);
                }
            }

        }

        if(sieve.get(0) == num){
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }


    }


}
