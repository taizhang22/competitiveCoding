
import java.util.*;
public class Q2011_4 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int biggrid[][] = new int[400][200];

        for (int i = 0; i < 400; i++) {
            for (int j = 0; j < 200; j++) {
                biggrid[i][j] = 0;

            }
        }

        biggrid[200][1] = 1;
        biggrid[200][2] = 1;
        biggrid[200][3] = 1;
        biggrid[201][3] = 1;
        biggrid[202][3] = 1;
        biggrid[203][3] = 1;
        biggrid[203][4] = 1;
        biggrid[203][5] = 1;
        biggrid[204][5] = 1;
        biggrid[205][5] = 1;
        biggrid[205][4] = 1;
        biggrid[205][3] = 1;
        biggrid[206][3] = 1;
        biggrid[207][3] = 1;
        biggrid[207][4] = 1;
        biggrid[207][5] = 1;
        biggrid[207][6] = 1;
        biggrid[207][7] = 1;
        biggrid[206][7] = 1;
        biggrid[205][7] = 1;
        biggrid[204][7] = 1;
        biggrid[203][7] = 1;
        biggrid[202][7] = 1;
        biggrid[201][7] = 1;
        biggrid[200][7] = 1;
        biggrid[199][7] = 1;
        biggrid[199][6] = 1;
        biggrid[199][5] = 1;


        while(true) {
            if (scanner.next().equals("l")){
                break;
            }




        }

    }
}