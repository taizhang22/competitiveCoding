import java.util.Scanner;
import java.lang.Math;
public class J52015 {

    static int[][][] stored = new int[252][252][252];


    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int pies = scan.nextInt();

        int people = scan.nextInt();


        //--- #1 = pies left --- #2 = people left --- #3 previous # of pies given

        for(int i = 0; i < 251; i++){
            for (int p = 0; p < 251; p++){
                for (int q = 0; q < 251; q++){
                    stored[i][p][q] = -1;
                }
            }
        }

        System.out.println(dynamic(pies, people,1));


    }



    private static int dynamic(int pies, int people, int previous){

        if (stored[pies][people][previous] != -1) //if we have a value assigned:
            return stored[pies][people][previous];

        if(pies == 0 && people == 0)
            return stored[pies][people][previous] = 1;

        if (pies == 0 || people == 0)
            return stored[pies][people][previous] = 0;

        //if its at this point, that means its a possible, but not final set

        stored[pies][people][previous] = 0;

        for(int consume = previous; consume <= Math.floor(pies/people); consume++)
            stored[pies][people][previous] += dynamic(pies - consume,people - 1, consume);
        return stored[pies][people][previous];






    }



}
