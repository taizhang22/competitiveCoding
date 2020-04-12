import java.util.Scanner;

public class Q2005_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int wide = scanner.nextInt();
        int high = scanner.nextInt();
        int cutwide = scanner.nextInt();
        int cuthigh = scanner.nextInt();
        int steps = scanner.nextInt();
        int grid[][] = new int[(high + 2)][(wide + 2)];

        for (int i = 0; i < (wide + 2); i++) {
            for (int k = 0; k < (high + 2); k++) {
                grid[k][i] = 0;
            }
        }

        for (int t = 0; t < cutwide; t++){
            for (int z = 0; z < cuthigh; z++){
                grid[high-z][wide-t] = 1;
            }
        }

        for (int t = 0; t < cutwide; t++){
            for (int z = 0; z < cuthigh; z++){
                grid[high-z][t+1] = 1;
            }
        }

        for (int t = 0; t < cutwide; t++){
            for (int z = 0; z < cuthigh; z++){
                grid[z+1][t+1] = 1;
            }
        }

        for (int t = 0; t < cutwide; t++){
            for (int z = 0; z < cuthigh; z++){
                grid[z+1][wide-t] = 1;
            }
        }

        for (int p = 0; p < (wide + 2); p++){
            grid[0][p] = 1;
        }

        for (int p = 0; p < (wide + 2); p++){
            grid[high+1][p] = 1;
        }

        for (int p = 0; p < (high + 2); p++){
            grid[p][0] = 1;
        }

        for (int p = 0; p < (high + 2); p++){
            grid[p][wide+1] = 1;
        }





        for(int p = 0; p < high + 2; p++)
        {
            for(int j = 0; j < wide + 2; j++)
            {
                System.out.print(grid[p][j]+ " ");
            }
            System.out.println();
        }


    }
}
