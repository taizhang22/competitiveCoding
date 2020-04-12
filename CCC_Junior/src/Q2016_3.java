public class Q2016_3 {
    public static void main(String[] args) {

String word="abcdefgabaabcdefg";
        word=word+" ";
        String reverse="";
        int number=1;
        int numberForCompare=0;
        for(int i=0; i<word.length(); i++) {
        for (int r = 1; r <= (word.length() - i-1) / 2; r++) {
        reverse=word.charAt(i+r-1)+reverse;
        if ( reverse.equals(word.substring(i + reverse.length(), i + 2 * reverse.length()))&&reverse.length()*2>numberForCompare) {
        numberForCompare = reverse.length() * 2;
        }
        if (reverse.equals(word.substring(i + reverse.length() + 1, i + reverse.length() * 2+1))&&reverse.length()*2+1>numberForCompare) {
        numberForCompare = reverse.length() * 2 + 1;
        }
        }
        if (numberForCompare > number) {
        number = numberForCompare;
        }
        reverse = "";
        }
        System.out.println(number);
        }
        }
