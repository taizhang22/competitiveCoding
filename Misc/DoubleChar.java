import java.util.Scanner;
import java.io.*;
import java.util.*;
public class DoubleChar {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        String input1 = scan.nextLine();
        String input2 = scan.nextLine();
        int amount = scan.nextInt();
        String output2 = "";
        String outputhi = "";
        int counter1 = 0;
        int counter2 = 0;
        String find = "hi";
        int front = 0;
        int cat1 = 0;
        int dog1 = 0;
        String outmultiple = "";

        int co = 0;

        for(int i = 0; i < input1.length(); i++){
            output2 = output2 + input1.charAt(i) + input1.charAt(i);
        }
        System.out.println(output2);


        cat1 = counter(input1, "cat");
        dog1 = counter(input1, "dog");

        if(dog1 > cat1){
            System.out.println("more dogs");
        } else if (cat1 > dog1) {
            System.out.println("more cats");
        } else {
            System.out.println("same amount");
        }


        while(input1.contains("co")){
            co = input1.indexOf("co");
            System.out.println("co at " + co);
            if (input1.charAt(co+3) == 'e'){
                counter1++;
            }
            input1 = input1.substring(co+4);
        }
        System.out.println(counter1);

        input1 = input1.toLowerCase();
        input2 = input2.toLowerCase();

        if(input1.contains(input2) || input2.contains(input1)){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if(input1.length() > 2){
            String repeat = input1.substring(0,3);
            for (int i = 0; i < amount; i++){
                outmultiple = outmultiple + repeat;
            }
            System.out.println(outmultiple);
        } else {
            for (int i = 0; i < amount; i++){
                outmultiple = outmultiple + input1;
            }
            System.out.println(outmultiple);
        }

        int loop = Math.min(input1.length(), input2.length());
        for(int i = 0; i < loop-1; i++){
            if(input1.substring(i, i+2).equals(input2.substring(i, i+2))){
                counter2++;
            }
        }
        System.out.println(counter2);

    }

    static int counter(String input, String find) {
        int front = 0;
        int counter = 0;
        while(input.indexOf(find) != -1){
            front = input.indexOf(find);
            counter++;
            input = input.substring(front + find.length());
        }
        return counter;

    }




}
