public class ArraySequence_OT {

    public static void main (String[] args) {

        int arr[] = {2, 1, 5, 3, 6, 4, 8, 9, 7};
        int maxarr[] = new int[arr.length];

        int p = 1;
        int finaltemp = 0;
        int temp = 0;
        int currmax = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        while (p < arr.length) {
            for (int i = p-1; i > 0; i--)

            if(arr[p] > arr[i] && maxarr[i] >= currmax){
                maxarr[p] += maxarr[i];
                currmax = maxarr[p]-1;
            }





            /*for (int i = p; i > 0; i--) {

                if (arr[p] > arr[i] && maxarr[i] > finaltemp) {
                    temp = maxarr[p] + maxarr[i];
                }

                if (temp > finaltemp){
                    finaltemp = temp;
                }


            }*/

        }


    }

}
