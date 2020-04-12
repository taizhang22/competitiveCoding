import java.util.Arrays;
import java.util.Scanner;

public class S22016 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int type = scan.nextInt();

        int amount = scan.nextInt();

        int dmoj[] = new int[amount];

        int peg[] = new int[amount];

        int total = 0;

        for (int i = 0; i < amount; i++){
            dmoj[i] = scan.nextInt();
        }

        for (int q = 0; q < amount; q++){
            peg[q] = scan.nextInt();
        }

        Arrays.sort(dmoj);
        Arrays.sort(peg);


        if (type == 1){
            for (int i = 0; i < amount; i++){
                if (dmoj[i] > peg[i]){
                    total += dmoj[i];
                } else {
                    total += peg[i] ;
                }
            }

            System.out.println(total);
        }

        if (type == 2){
            for (int i = 0; i < amount; i++){
                if (dmoj[i] > peg[amount-i-1]){
                    total += dmoj[i];
                } else {
                    total += peg[amount-i-1];
                }
            }

            System.out.println(total);
        }




    }


}
