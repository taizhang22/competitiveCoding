import java.util.Scanner;
public class J52005 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);


        String scanned = scan.nextLine();
        char[] word = scanned.toCharArray();
        while(word[0] != 'X'){

            if(monkeyLang(word)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            scanned = scan.nextLine();
            word = scanned.toCharArray();
        }



    }

    private static boolean monkeyLang(char[] word){

        if (word.length == 1)
            if(word[0] == 'A')
                return true;

        if (word[0] == 'B'){
           if(word[word.length-1] == 'S'){
                if(word.length > 2){
            char[] word2 = new char[word.length-2];
            for(int i = 1; i < word.length-1; i++){
                word2[i-1] = word[i];
            }
            if (monkeyLang(word2)){
                    return true;
                } else {
                    return false;
                }
            }

           }
        } else {
            if(word[0] == 'A'){
                if(word[1] == 'N'){
                    if(word.length > 2) {
                        char[] word3 = new char[word.length - 2];
                        for (int i = 2; i < word.length; i++) {
                            word3[i - 2] = word[i];
                        }
                        if (monkeyLang(word3)) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            }

        }
        return false;
    }

}

//2015 J5 PI DAY