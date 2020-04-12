import java.util.Scanner;
public class S11998 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int lines = scan.nextInt();

        String[] strings = new String[lines];

        String conv;

        String smh = scan.nextLine();

        for(int i = 0; i < lines; i++){
            strings[i] = scan.nextLine();
        }

        for (int i = 0; i < lines; i++){
            conv = strings[i];
            String sep[] = conv.split("\\s+");

            for (int q = 0; q < sep.length; q++){
                if (sep[q].length() == 4){
                    sep[q] = "****";
                }
            }

            for (int p = 0 ; p < sep.length; p++){
                System.out.print(sep[p] + " ");
            }
            System.out.println("");


        }




    }
}
