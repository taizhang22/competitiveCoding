public class Q2016_2 {


    static int arr[][] = {{16,3,2,13}, {5,10,11,8}, {9,6,7,12}, {4,15,14,1}};
    public static boolean compute() {
        //add up first row, save sum
        //add other rows/columns.
        //if at any point they don't match, then return false.
        //if it finishes, return true.
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            sum += arr[0][i];
        }

        for(int r = 1; r < 4; r++) {
            int tempSum = 0;
            for(int c = 0; c < 4; c++){
                tempSum+= arr[r][c];

            }
            if (tempSum != sum){
                return false;
            }
        }

        for(int c = 0; c < 4; c++) {
            int tempSum = 0;
            for (int r = 0; r < 4; r++) {
                tempSum += arr[r][c];

            }
            if (tempSum != sum) {
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args){

        boolean isMagic = compute();

        if(isMagic){
            System.out.println("Magic");
        } else {
            System.out.println("Not magic :/");
        }

    }
}