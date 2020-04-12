import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class S32010 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int xfence = scan.nextInt();

        int yfence = scan.nextInt();

        int xhouse1 = scan.nextInt();

        int yhouse1 = scan.nextInt();

        int xhouse2 = scan.nextInt();

        int yhouse2 = scan.nextInt();



        double[] arr = {100000001, 100000002, 100000003, 100000004, 100000005, 100000006, 100000007, 100000008};


        if ((xfence>xhouse1) && (xfence<xhouse2)){
            int south = Math.abs(yfence-yhouse1);
            int north = Math.abs(yfence-yhouse2);
            arr[4] = south;
            arr[5] = north;
        }



        if ((yfence>yhouse1) && (yfence<yhouse2)){
            int west = Math.abs(xfence-xhouse1);
            int east = Math.abs(xfence-xhouse2);
            arr[6] = west;
            arr[7] = east;
        }

        if((arr[4] == 100000005) || (arr[6] == 100000007)){

        double cornerSW = Math.sqrt(Math.pow(Math.abs(xfence-xhouse1),2) + Math.pow(Math.abs(yfence-yhouse1),2));
            arr[0] = cornerSW;

        double cornerNW = Math.sqrt(Math.pow(Math.abs(xfence-xhouse1),2) + Math.pow(Math.abs(yfence-yhouse2),2));
            arr[1] = cornerNW;

        double cornerNE = Math.sqrt(Math.pow(Math.abs(xfence-xhouse2),2) + Math.pow(Math.abs(yfence-yhouse1),2));
            arr[2] = cornerNE;

        double cornerSE = Math.sqrt(Math.pow(Math.abs(xfence-xhouse2),2) + Math.pow(Math.abs(yfence-yhouse2),2));
            arr[3] = cornerSE;
        }

        Arrays.sort(arr);

        System.out.println(String.format("%.3f", arr[0]));





    }
}
