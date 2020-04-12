public class Q2014_2 {

    public static void main(String[] args) {

        int count = 10;
        String input = "ABABABAAAA";
        //detect
        int A = 0;
        int B = 0;
        for (int i = 0; i < count; i++) {
            if (input.charAt(i) == 'A') {
                A++;
            } else {
                B++;
            }


        }
        if (A == B) {
            System.out.println("Tie");
        } else {
            if (A < B) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
            }
            System.out.println("A votes:" + A + " " + "B Votes:" + B);
        }


    }



