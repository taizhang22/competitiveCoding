public class Q2013_2 {
    public static void main(String[] args) {

        //I,O,S,H,Z,X,N

        String input = "SHINS";
        int wtf = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'I'){
                wtf++;
            } else {
                if (input.charAt(i) == 'O'){
                    wtf++;
                } else {
                    if (input.charAt(i) == 'S'){
                        wtf++;
                    } else {
                        if (input.charAt(i) == 'H'){
                            wtf++;
                        } else {
                            if (input.charAt(i) == 'Z'){
                                wtf++;
                            } else {
                                if (input.charAt(i) == 'X'){
                                    wtf++;
                                } else {
                                    if (input.charAt(i) == 'N'){
                                        wtf++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (wtf == input.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}