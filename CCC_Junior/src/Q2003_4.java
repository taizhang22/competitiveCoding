import java.util.Scanner;

public class Q2003_4 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {

        int versecount = scanner.nextInt();
        System.out.println(versecount);

        String lineuseless = scanner.nextLine();

        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();
        String line4 = scanner.nextLine();
        if (versecount >= 2){
            String line5 = scanner.nextLine();
            String line6 = scanner.nextLine();
            String line7 = scanner.nextLine();
            String line8 = scanner.nextLine();
        }
        if (versecount >= 3) {
            String line9 = scanner.nextLine();
            String line10 = scanner.nextLine();
            String line11 = scanner.nextLine();
            String line12 = scanner.nextLine();
        }
        if (versecount >= 4) {
            String line13 = scanner.nextLine();
            String line14 = scanner.nextLine();
            String line15 = scanner.nextLine();
            String line16 = scanner.nextLine();
        }
        if (versecount >= 5) {
            String line17 = scanner.nextLine();
            String line18 = scanner.nextLine();
            String line19 = scanner.nextLine();
            String line20 = scanner.nextLine();
        }


        for (int i = 0; i < line1.length(); i++){
            if (line1.charAt(line1.length() - i) == 'a'){
                String rhyme1 = "a";
                break;
            }
            if (line1.charAt(line1.length() - i) == 'e'){
                String rhyme1 = "e";
                break;
            }
            if (line1.charAt(line1.length() - i) == 'i'){
                String rhyme1 = "i";
                break;
            }
            if (line1.charAt(line1.length() - i) == 'o'){
                String rhyme1 = "o";
                break;
            }
            if (line1.charAt(line1.length() - i) == 'u'){
                String rhyme1 = "u";
                break;
            }
            if (line1.charAt(line1.length() - i) == ' '){
                line1.substring(i,line1.length());
            }

        }

        for (int i = 0; i < line2.length(); i++){
            if (line2.charAt(line2.length() - i) == 'a'){
                String rhyme2 = "a";
                break;
            }
            if (line2.charAt(line2.length() - i) == 'e'){
                String rhyme2 = "e";
                break;
            }
            if (line2.charAt(line2.length() - i) == 'i'){
                String rhyme2 = "i";
                break;
            }
            if (line2.charAt(line2.length() - i) == 'o'){
                String rhyme2 = "o";
                break;
            }
            if (line2.charAt(line2.length() - i) == 'u'){
                String rhyme2 = "u";
                break;
            }
            if (line2.charAt(line2.length() - i) == ' '){
                String sub2 = line2.substring(i,line2.length());
                break;
            }
        }

        System.out.println();




    }
}
