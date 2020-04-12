public class Q2012_3Redo {

    public static void main(String[] args) {
        String arr1[] = {"*", "x", "*"};
        String arr2[] = {" ", "x", "x"};
        String arr3[] = {"*", " ", "*"};

        int k = 5;

        for (int a = 0; a < k; a++){
            for (int b = 0; b < 3; b++){
                for (int c = 0; c < k; c++){
                    System.out.print(arr1[b]);
                }

            }
            System.out.println();
        }

        for (int d = 0; d < k; d++){
            for (int e = 0; e < 3; e++){
                for (int f = 0; f < k; f++){
                    System.out.print(arr2[e]);
                }

            }
            System.out.println();
        }

        for (int g = 0; g < k; g++){
            for (int h = 0; h < 3; h++){
                for (int i = 0; i < k; i++){
                    System.out.print(arr3[h]);
                }

            }
            System.out.println();
        }



    }
}