import java.util.Scanner;
import java.util.*;

public class Q2016_5 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int whichq = scanner.nextInt();
        int howmany = scanner.nextInt();

        int[] dmoj = new int[howmany];
        int[] peg = new int[howmany];
        int sum = 0;

        for (int d = 0; d < howmany; d++) {
            dmoj[d] = scanner.nextInt();
        }

        for (int p = 0; p < howmany; p++) {
            peg[p] = scanner.nextInt();
        }

        Arrays.sort(dmoj);
        Arrays.sort(peg);


        if (whichq == 1) {

            for (int z = 0; z < dmoj.length; z++) {
                if (dmoj[z] >= peg[z]) {
                    sum += dmoj[z];
                } else {
                    sum += peg[z];
                }
            }
        } else {

            for (int y = 0; y < dmoj.length; y++) {
                if (dmoj[dmoj.length - y - 1] > peg[y]) {
                    sum += dmoj[dmoj.length - y - 1];
                } else {
                    sum += peg[y];
                }
            }

        }

        System.out.println(sum);

    }
}
