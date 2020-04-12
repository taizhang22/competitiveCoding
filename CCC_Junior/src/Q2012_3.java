public class Q2012_3 {

    public static void main(String[] args) {
        String line1 = "*x*";
        String arr1[] = {"*", "x", "*"};
        String arr2[] = {" ", "x", "x"};
        String arr3[] = {"*", " ", "*"};

        String line2 = " xx";
        String line3 = "* *";
        int k = 24;

// so i want to duplicate each of the 3 arr by k

        for (int i = 0; i < 3; i++) {
            for (int a = 0; a < k; a++) {
                System.out.print(arr1[i]);
            }
        }
        System.out.println();

        for (int j = 0; j < 3; j++) {
            for (int a = 0; a < k; a++){
                System.out.print(arr2[j]);
            }
        }

        System.out.println();

        for (int l = 0; l < 3; l++)   {
            for (int a = 0; a < k; a++) {
                System.out.print(arr3[l]);
            }
        }


    }
}










