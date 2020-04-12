import java.util.Arrays;
import java.util.Scanner;

public class S12018 {


    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int villages = scan.nextInt();

        double lowest = 2000000000;

        double[] arr = new double[villages];

        for (int q = 0; q < villages; q++){
            arr[q] = scan.nextDouble();
        }

        Arrays.sort(arr);

        for (int i = 0; i < villages-2; i++){

            double temp = (arr[i+2] - arr[i])/2;

            if (temp < lowest){
                lowest = temp;
            }

        }

        System.out.printf("%.1f", lowest);


    }
}
