import java.util.Scanner;
import java.io.*;
import java.util.*;

public class HC_1D_ArrayPart2 {

        public static boolean canWin(int leap, int[] game) {
            return canDo(leap, game, 0);
        }

        public static boolean canDo(int leap, int[] game, int i) {
            if (i < 0 || game[i] == 1){
                return false;
            }

            if (i == game.length -1 || (i + leap > game.length-1)){
                return true;
            }
            game[i] = 1;

            return(canDo(leap, game, i + 1) || canDo(leap, game, i + -1) || canDo(leap, game, i + leap));
        }



        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int q = scan.nextInt();
            while (q-- > 0) {
                int n = scan.nextInt();
                int leap = scan.nextInt();

                int[] game = new int[n];
                for (int i = 0; i < n; i++) {
                    game[i] = scan.nextInt();
                }

                System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
            }
            scan.close();
        }


    }



