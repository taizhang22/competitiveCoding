public class Q2007_3 {


    public static void main(String[] args){


        int arrnums[] = {100,500,1000,5000,10000,25000,50000,100000,500000,1000000};
        int finalnum = 0;
        int averaged = 0;
        int bankers = 198000;
        int arr[] = {3,8};

        for (int i = 0; i < arr.length; i++) {

            switch (arr[i]) {
                case 1:
                    arrnums[0] = 0;
                    break;
                case 2:
                    arrnums[1] = 0;
                    break;
                case 3:
                    arrnums[2] = 0;
                    break;
                case 4:
                    arrnums[3] = 0;
                    break;
                case 5:
                    arrnums[4] = 0;
                    break;
                case 6:
                    arrnums[5] = 0;
                    break;
                case 7:
                    arrnums[6] = 0;
                    break;
                case 8:
                    arrnums[7] = 0;
                    break;
                case 9:
                    arrnums[8] = 0;
                    break;
                case 10:
                    arrnums[9] = 0;
                    break;

            }
        }

        for (int i = 0; i < arrnums.length; i++) {
            if (arrnums[i] > 0){
                finalnum += arrnums[i];
                averaged++;
            }
        }

        int finalaveraged = finalnum/averaged;

        if (bankers > finalaveraged){
            System.out.println("Deal");
        } else {
            System.out.println("No Deal");
        }

        System.out.println(averaged);
        System.out.println(finalaveraged);
        System.out.println(finalnum);

    }
}