import java.util.Scanner;

public class Q2006_1 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Welcome to Chip’s Fast Food Emporium");
        System.out.println(" ");
        System.out.print("Please enter a burger choice:");
        int burger = scanner.nextInt();
        System.out.print("Please enter a side order choice:");
        int side = scanner.nextInt();
        System.out.print("Please enter a dessert choice:");
        int drink = scanner.nextInt();
        System.out.print("Please enter a drink choice:");
        int dessert = scanner.nextInt();
        System.out.println(" ");

        int total = 0;

        if (burger == 1){
            total +=461;
        } else {
            if (burger == 2){
                total +=431;
            } else {
                if (burger == 3){
                    total +=420;
                }
            }
        }


        if (side == 1){
            total +=100;
        } else {
            if (side == 2){
                total +=57;
            } else {
                if (side == 3){
                    total +=70;
                }
            }
        }

        if (drink == 1){
            total +=130;
        } else {
            if (drink == 2){
                total +=160;
            } else {
                if (drink == 3){
                    total +=118;
                }
            }
        }


        if (dessert == 1){
            total +=167;
        } else {
            if (dessert == 2){
                total +=266;
            } else {
                if (dessert == 3){
                    total +=75;
                }
            }
        }

        System.out.println("Your total calorie count is "+ total + ".");


    }

}
