public class Q2015_2 {

    public static void main(String[] args) {

        String input = ":-(asdfasd:-)fasdf:-";
        //detect smiley
            int happyface = 0;
            int sadface = 0;
        for(int a = 0; a < input.length()-2; a++) {
            char a_char = input.charAt(a);
            char b_char = input.charAt(a+1);
            char c_char = input.charAt(a+2);
            if(a_char == ':'){
                if(b_char == '-'){
                    if(c_char == ')'){
                        happyface++;
                    } else {
                        if(c_char == '('){
                            sadface++;
                        }
                    }
                }
            }


        }
        if(happyface > sadface){
            System.out.println("happy");
        } else {
            if(happyface < sadface){
                System.out.println("sad");
            } else {
                if (happyface == 0 && sadface == 0){
                    System.out.println("none");
                } else {
                    System.out.println("unsure");
                }
            }
        }
        System.out.println("Happy faces:" + happyface + " " + "Sad faces:" + sadface);

    }


}

