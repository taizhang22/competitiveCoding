import java.util.Scanner;

public class Q2003_1 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {

        int tinelength = scanner.nextInt();
        int tinespacing = scanner.nextInt();
        int handle = scanner.nextInt();

        for (int i = 0; i < tinelength; i++){
            System.out.print("*");
            for (int q = 0; q < tinespacing; q++){
                System.out.print(" ");
            }
            System.out.print("*");
            for (int w = 0; w < tinespacing; w++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }


        System.out.print("*");
        for (int z = 0; z < tinespacing; z++){
            System.out.print("*");
        }

        System.out.print("*");
        for (int z = 0; z < tinespacing; z++){
            System.out.print("*");
        }

        System.out.print("*");
        System.out.println();


        for (int i = 0; i < handle; i++){
            System.out.print(" ");
            for (int t = 0; t < tinespacing; t++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();

        }

    }
}
