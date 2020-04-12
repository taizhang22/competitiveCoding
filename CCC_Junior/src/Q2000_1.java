import java.util.Scanner;

public class Q2000_1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int day = scanner.nextInt();
        int number = scanner.nextInt();

        System.out.println("Sun Mon Tue Wed Thr Fri Sat");

        switch (day) {

            case 1:
                System.out.println(" 1   2   3   4   5   6   7");
                System.out.println(" 8   9  10  11  12  13  14");
                System.out.println("15  16  17  18  19  20  21");
                System.out.println("22  23  24  25  26  27  28");
                break;
            case 2:
                System.out.println("     1   2   3   4   5   6");
                System.out.println(" 7   8   9  10  11  12  13");
                System.out.println("14  15  16  17  18  19  20");
                System.out.println("21  22  23  24  25  26  27");
                System.out.print("28");
                break;
            case 3:
                System.out.println("         1   2   3   4   5");
                System.out.println(" 6   7   8   9  10  11  12");
                System.out.println("13  14  15  16  17  18  19");
                System.out.println("20  21  22  23  24  25  26");
                System.out.print("27  28");
                break;
            case 4:
                System.out.println("             1   2   3   4");
                System.out.println(" 5   6   7   8   9  10  11");
                System.out.println("12  13  14  15  16  17  18");
                System.out.println("19  20  21  22  23  24  25");
                System.out.print("26  27  28");
                break;
            case 5:
                System.out.println("                 1   2   3");
                System.out.println(" 4   5   6   7   8   9  10");
                System.out.println("11  12  13  14  15  16  17");
                System.out.println("18  19  20  21  22  23  24");
                System.out.print("25  26  27  28");
                break;
            case 6:
                System.out.println("                     1   2");
                System.out.println(" 3   4   5   6   7   8   9");
                System.out.println("10  11  12  13  14  15  16");
                System.out.println("17  18  19  20  21  22  23");
                System.out.print("24  25  26  27  28");
                break;
            case 7:
                System.out.println("                         1");
                System.out.println(" 2   3   4   5   6   7   8");
                System.out.println(" 9  10  11  12  13  14  15");
                System.out.println("16  17  18  19  20  21  22");
                System.out.print("23  24  25  26  27  28");
                break;
        }

        if (day == 1) {
            switch (number) {
                case 29:
                    System.out.println("29");
                    break;

                case 30:
                    System.out.println("29  30");
                    break;

                case 31:
                    System.out.println("29  30  31");
                    break;
            }
        }

        if (day > 1 && day < 6){
            switch (number) {
                case 29:
                    System.out.print("  29");
                    break;

                case 30:
                    System.out.print("  29  30");
                    break;

                case 31:
                    System.out.print("  29  30  31");
                    break;
            }
        }

        if (day == 6){
            switch (number) {
                case 29:
                    System.out.print("  29");
                    break;

                case 30:
                    System.out.print("  29  30");
                    break;

                case 31:
                    System.out.println("  29  30");
                    System.out.print("31");
                    break;
            }
        }


        if (day == 7){
            switch (number) {
                case 29:
                    System.out.print("  29");
                    break;

                case 30:
                    System.out.println("  29");
                    System.out.print("30");
                    break;

                case 31:
                    System.out.println("  29");
                    System.out.print("30 31");
                    break;
            }
        }










    }
}

