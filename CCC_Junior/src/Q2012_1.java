public class Q2012_1 {
    public static void main(String[] args) {

        int speedlimit = 50;
        int yourspeed = 50;


        if (yourspeed <= speedlimit){
            System.out.println("Congratulations, you are within the speed limit!");
        } else {
            if (yourspeed <= speedlimit+20){
                System.out.println("You are speeding and your fine is $100");
            } else {
                if (yourspeed  <= speedlimit+30){
                    System.out.println("You are speeding and your fine is $270");
                } else {
                    if (yourspeed  >= speedlimit+31){
                        System.out.println("You are speeding and your fine is $500");
                    }
                }
            }
        }


    }

}