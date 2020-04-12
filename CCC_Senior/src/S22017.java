import java.util.Scanner;
import java.util.Arrays;
public class S22017 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);


        int a = scan.nextInt();

        int arr[] = new int[a];


        for (int i = 0; i < a; i++){
            arr[i] = scan.nextInt();
        }

        Arrays.sort(arr);


        if (a % 2 == 0) {
            for(int c = 0; c < a/2; c++){
                System.out.print(arr[(a/2)-c-1] + " " + arr[(a/2)+c] + " ");
            }
        }


        if (a % 2 == 1){
            for (int d = 0; d < a/2; d++){
                System.out.print(arr[(a/2)-d] + " " + arr[(a/2)+d+1] + " ");
            }
            System.out.print(arr[0]);

        }




    }
}
