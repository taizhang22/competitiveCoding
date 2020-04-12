public class ArrayMaze
{
    public static void main (String args[]){

        int arr[] = {2,1,5,3,6,4,8,9,7};

        int maze[][] = {{1, 3, 5, 9},{8, 1, 3, 4}, {5, 0, 6, 1}, {8, 8, 4, 0}};

        int newtemp = 0;
        int temp = 0;
        int count = 1; //includes the starting number
        int finalcount = 0;


        for(int i = 0; i < arr.length; i++) {
            temp = arr[i];
            int p = i + 1;

            while (p < arr.length) {
                if (arr[p] >= temp) {
                    count++;
                    temp = arr[p];
                }
                p++;
            }

            if(count > finalcount){
                finalcount = count;

            }

            System.out.println("Largest possible number starting from " + arr[i] + " is " + count);
            count = 1;

        }

        System.out.println("Largest possible number is " + finalcount);


    }

}
