public class S2016_4 {

    public static void main(String[] args){

        int numballs = 4;

        int[] riceballs = {2, 2, 2, 2, 2, 2};

        int again = 0;


        int[][] dparray = new int[riceballs.length][riceballs.length];

        //the array is in Y X BTW


        // this is to fill the DPARRAY with element 0
        for(int i = 0; i < dparray.length; i++){
            for (int j = 0; j < dparray[i].length; j++){
                dparray[i][j] = 0;
            }
        }


        // this is to initialize the DPARRAY with the elements in a diagonal format
        for (int t = 0; t < dparray.length; t++){
            dparray[t][t] = riceballs[t];
        }


        /*
        // this is to calculate the 2 ADD
        for (int e = 0; e < dparray.length-1; e++){
            if (dparray[e][e] == dparray[e+1][e+1]){
                dparray[e][e+1] = dparray[e][e] + dparray[e][e];
            }

        }

        // this is to calculate the SECOND 2 ADD.
        // You should be combining this with the FIRST 2 ADD

        for (int i = 0; i < dparray.length-3; i++){
            if (dparray[i][i+1] == dparray[i+2][i+3]){
                dparray[i][i+3] = dparray[i][i+1] + dparray[i+2][i+3];
            }
        }


        this is to calculate the 3 ADD

        for (int e = 0; e < dparray.length-2; e++){
            if ((dparray[e][e] == dparray[e+1][e+1]) && (dparray[e+2][e+2] == dparray[e+1][e+1])){
                dparray[e][e+2] = dparray[e][e] + dparray[e+1][e+1] + dparray[e+2][e+2];

            }
        }
        */


        // this is to display the DPARRAY
        for(int p = 0; p < dparray.length; p++){
            for (int q = 0; q < dparray[p].length; q++){
                System.out.print(dparray[p][q] + " ");
            }
            System.out.println("");
        }


    }


}
