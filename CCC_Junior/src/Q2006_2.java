import java.util.Scanner;

public class Q2006_2 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.print("Enter m: ");
        int m = scanner.nextInt();
        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int ten = 0;

        for (int i = 1; i <= m; i++){
            for (int y = 1; y <= n; y++){
                if ((i + y)== 10){
                    ten++;
                }
            }
        }

        System.out.println("There are " + ten + " ways to get the sum 10.");




    }

}