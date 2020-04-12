import java.util.Scanner;

public class S22013 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        int onbridge = 0;

        int counter = 0;

        int total = 0;



        int max = scan.nextInt();

        int amount = scan.nextInt();


        int arr[] = new int[amount];


        for (int i = 0; i < amount; i++){
            arr[i] = scan.nextInt();

        }

        for (int p = 0; p < amount; p++){

            onbridge += arr[p];

            counter++;
            total++;

            if(counter > 4){
                onbridge -= arr[p-4];
                counter--;
            }

            //System.out.println("The bridge has " + counter + "cars on, and it weighs " + onbridge + ". Total amount of cars traversed = " + total);


            if(onbridge > max){
                System.out.println(total - 1);
                break;
            }

            if (p == amount-1){
                System.out.println(total);
            }

        }





    }


}
