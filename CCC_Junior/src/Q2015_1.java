public class Q2015_1 {


        public static void main(String[] args) {


                int month1 = 1;

                int month2 = 2;

                int monthInput = 2;
                int dayInput = 18;

                if (monthInput == month2) {
                        if (dayInput == 18) {
                                System.out.println("Special");
                        } else {
                              if (dayInput < 18){
                                      System.out.println("Before");
                                } else {
                                      System.out.println("After");
                              }
                        }


                } else {
                        if (monthInput == month1) {
                                System.out.println("before");
                        } else {
                                System.out.println("after");
                        }
                }
        }

}
