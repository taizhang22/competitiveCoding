import java.util.Scanner;
public class S32005 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int matrices = scan.nextInt();

        int x = scan.nextInt();
        int y = scan.nextInt();

        int temp[][];

        int arr1[][] = new int [x][y];

        for (int q = 0; q < x; q++){
            for (int w = 0; w < y; w++){
                arr1[q][w] = scan.nextInt();
            }
        }

        /*
        for (int q = 0; q < x; q++){
            for (int w = 0; w < y; w++){
                System.out.print(arr1[q][w] + " ");
            }
            System.out.println("");
        }
        */



        for (int i = 0; i < matrices-1; i++){

            int t = scan.nextInt();

            int z = scan.nextInt();

            int next[][] = new int[t][z];


            for (int q = 0; q < x; q++){
                for (int w = 0; w < y; w++){
                    next[q][w] = scan.nextInt();
                }
            }

            temp = new int[t*x][z*y];

            for (int ii = 0; ii < t*x; i+=t){
                for (int zz = 0; zz < z*y; zz+=z){

                    for (int aa = 0; aa < x; aa++){
                        for(int bb = 0; bb < y; bb++){
                            temp[aa+ii][bb+zz] = arr1[aa][bb] * next[aa][bb];
                        }

                    }


                }
            }

            for (int printx = 0; printx < t*x; printx++){
                for(int printy = 0; printy < z*y; printy++){
                    System.out.print(temp[printx][printy]+ " ");
                }
                System.out.println("");

            }







        }



    }


}
