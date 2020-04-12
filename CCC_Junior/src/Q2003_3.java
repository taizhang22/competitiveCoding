import java.util.Scanner;

public class Q2003_3 {


    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {


        int square = 1;
        while(true){
            System.out.println("Enter sum of dice:");
            int dice = scanner.nextInt();
            if(dice == 0){
                System.out.println("You Quit!");
                break;
            }

            square += dice;

            if(square == 9){
                square = 34;
            }
            if(square == 40){
                square = 64;
            }
            if(square == 67){
                square = 86;
            }

            if(square == 54){
                square = 19;
            }

            if(square == 90){
                square = 48;
            }
            if(square == 99){
                square = 77;
            }

            if (square > 100){
                square -= dice;
            }

            System.out.println("You are now on square " + square);

            if (square == 100){
                System.out.println("You Win!");
                break;
            }


        }



    }
}
