public class Q2014_3 {

    public static void main(String[] args) {

        int scoreA = 100;
        int scoreD = 100;
        int rounds = 4;

        // i need to convert those numbers into an array
        int arrA[] = {5, 6, 4, 5};
        int arrB[] = {6, 6, 3, 2};


        for (int i = 0; i < rounds; i++) {
            if (arrA[i] > arrB[i]) {
                scoreD -= arrA[i];
            } else {
                if (arrB[i] > arrA[i]) {
                    scoreA -= arrB[i];
                }
            }

        }

        System.out.println("David's Score=" + " " + scoreD + " " + "Antonia's Score=" + " " + scoreA);

    }

}



