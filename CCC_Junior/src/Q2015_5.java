import java.util.Scanner;

public class Q2015_5 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // n is the pies
        // k is number of people
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int bigoof = 0;

        int[] people = new int[k];

        if (k == n) {
            System.out.println(k);
        }

        if (k == 1) {
            System.out.println("1");
        }

        switch (k) {
            case 1:
                System.out.println("1");
                break;

            case 2:
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        if ((a + b) == n) {
                            if (a >= b) {
                                bigoof++;
                            }
                        }
                    }
                }
                break;

            case 3:
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        for (int c = 0; c < n; c++) {
                            if ((a + b + c) == n) {
                                if ((a >= b) && (b >= c)) {
                                    bigoof++;
                                }
                            }
                        }
                    }
                }
                    break;
            case 4:
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        for (int c = 0; c < n; c++) {
                            for (int d = 0; d < n; d++){
                                if ((a + b + c + d) == n) {
                                    if ((a >= b) && (b >= c) && (c >= d)) {
                                        bigoof++;
                                    }
                                }
                            }
                        }
                    }
                }
                break;

            case 5:
                for (int a = 0; a < n; a++) {
                    for (int b = 0; b < n; b++) {
                        for (int c = 0; c < n; c++) {
                            for (int d = 0; d < n; d++){

                            }
                        }
                    }
                }
                break;



        }
    }
}
