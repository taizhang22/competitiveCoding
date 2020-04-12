import java.util.Scanner;

public class Q2000_3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("How many quarters does Martha have in the jar.");
        int brokeaf = scanner.nextInt();
        System.out.println("How many times has the first machine been played since paying out?");
        int machine1 = scanner.nextInt();
        System.out.println("How many times has the second machine been played since paying out?");
        int machine2 = scanner.nextInt();
        System.out.println("How many times has the third machine been played since paying out?");
        int machine3 =  scanner.nextInt();
        int getplayed = 0;

        while (true){
            machine1++;
            brokeaf--;
            if (machine1 == 35){
                brokeaf +=30;
                machine1 = 0;
                getplayed++;
            } else {
                getplayed++;
            }
            if (brokeaf == 0){
                break;
            }

            machine2++;
            brokeaf--;
            if (machine2 == 100){
                brokeaf +=60;
                machine2 = 0;
                getplayed++;
            } else {
                getplayed++;
            }
            if (brokeaf == 0){
                break;
            }

            machine3++;
            brokeaf--;
            if (machine3 == 10){
                brokeaf +=9;
                machine3 = 0;
                getplayed++;
            } else {
                getplayed++;
            }
            if (brokeaf == 0){
                break;
            }

        }

        System.out.println("Martha plays " + getplayed + " before going broke.");

    }
}
