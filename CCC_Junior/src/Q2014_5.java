import java.util.Scanner;

public class Q2014_5 {



    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){


        int names = scanner.nextInt();
        String arr[] = new String[names];
        String arr2[] = new String[names];

        int correct = 0;

        for (int i = 0; i < names; i++) {
            arr[i] = scanner.next();
        }
        for (int k = 0; k < names; k++){
            arr2[k] = scanner.next();
        }

        for (int a = 0; a < names; a++){
            for (int b = 0; b < names; b++){

                if (arr[a].equals (arr2[b])){
                    if (arr[b].equals (arr2[a])){
                        if (arr[a].equals (arr2[a])){
                        } else {
                            correct++;
                        }

                    }
                }
            }
        }

        if (correct == names){
            System.out.println("good");
        } else {
            System.out.println("bad");
        }


//why are you looking at this code. go find a faster one


    }
}
