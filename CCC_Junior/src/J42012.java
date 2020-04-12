import java.util.Scanner;
import java.io.*;
import java.util.*;
public class J42012 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        String output = "";

        int k = scan.nextInt()%26;
        int s = 0;



        String line = scan.next().toLowerCase();

        for(int i = 0; i < line.length(); i++){
            int j = line.charAt(i);
            s = ((3*(i+1)) + k)%26;
            j -= s;

            if(j < 97){
                j -= 6;
            }

            output = output + (char)j;

        }
        System.out.println(output.toUpperCase());





    }
}
