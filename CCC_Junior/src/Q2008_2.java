public class Q2008_2 {

    public static void main(String[] args) {

        char arr1[] = {'A','B','C','D','E'};

        int arr[] = {2,1,3,1,2,3,4,1};

        for (int i = 0; i < arr.length; i+=2){

            if (arr[i] == 1) {
                for (int q = 0; q < arr[i + 1]; q++) {
                    char temp0 = arr1[0];
                    char temp1 = arr1[1];
                    char temp2 = arr1[2];
                    char temp3 = arr1[3];
                    char temp4 = arr1[4];
                    arr1[0] = temp1;
                    arr1[1] = temp2;
                    arr1[2] = temp3;
                    arr1[3] = temp4;
                    arr1[4] = temp0;

                }
            }

            if (arr[i] == 2){
                for(int p = 0; p < arr[i+1]; p++){
                    char temp0 = arr1[0];
                    char temp1 = arr1[1];
                    char temp2 = arr1[2];
                    char temp3 = arr1[3];
                    char temp4 = arr1[4];
                    arr1[0] = temp4;
                    arr1[1] = temp0;
                    arr1[2] = temp1;
                    arr1[3] = temp2;
                    arr1[4] = temp3;
                }
                }



            if (arr[i] == 3){
                for (int r = 0; r < arr[i+1]; r++){
                    char temp0 = arr1[0];
                    char temp1 = arr1[1];
                    arr1[0] = temp1;
                    arr1[1] = temp0;
                }
            }
        }

        System.out.println(arr1);
    }
}