import java.util.Scanner;

public class Q2006_3 {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int total = 0;

        while (true) {
            String a = scanner.next();

            if (a == "halt") {
                break;
            }

            for (int i = 0; i < a.length(); i++) {

                switch (a.charAt(i)) {

                    case 'a':
                        total += 1;
                        int beforea = previousLetter(a.charAt(i),a.charAt(i+1));
                        total += beforea;
                        break;
                    case 'b':
                        total += 2;

                        break;
                    case 'c':
                        total += 3;
                        int beforec = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforec;
                        break;
                    case 'd':
                        total += 1;
                        int befored = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= befored;
                        break;
                    case 'e':
                        total += 2;
                        int beforee = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforee;
                        break;
                    case 'f':
                        total += 3;
                        int beforef = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforef;
                        break;
                    case 'g':
                        total += 1;
                        int beforeg = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforeg;
                        break;
                    case 'h':
                        total += 2;
                        int beforeh = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforeh;
                        break;
                    case 'i':
                        total += 3;
                        int beforei = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforei;
                        break;
                    case 'j':
                        total += 1;
                        int beforej = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforej;
                        break;
                    case 'k':
                        total += 2;
                        int beforek = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforek;
                        break;
                    case 'l':
                        total += 3;
                        int beforel = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforel;
                        break;
                    case 'm':
                        total += 1;
                        int beforem = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforem;
                        break;
                    case 'n':
                        total += 2;
                        int beforen = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforen;
                        break;
                    case 'o':
                        total += 3;
                        int beforeo = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforeo;
                        break;
                    case 'p':
                        total += 1;
                        int beforep = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforep;
                        break;
                    case 'q':
                        total += 2;
                        int beforeq = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforeq;
                        break;
                    case 'r':
                        total += 3;
                        int beforer = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforer;
                        break;
                    case 's':
                        total += 4;
                        int befores = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= befores;
                        break;
                    case 't':
                        total += 1;
                        int beforet = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforet;
                        break;
                    case 'u':
                        total += 2;
                        int beforeu = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforeu;
                        break;
                    case 'v':
                        total += 3;
                        int beforev = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforev;
                        break;
                    case 'w':
                        total += 1;
                        int beforew = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforew;
                        break;
                    case 'x':
                        total += 2;
                        int beforex = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforex;
                        break;
                    case 'y':
                        total += 3;
                        int beforey = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforey;
                        break;
                    case 'z':
                        total += 4;
                        int beforez = previousLetter(a.charAt(i),a.charAt(i+1));
                        total+= beforez;
                        break;
                }


            }
        }

        System.out.println(total);

    }


    public static int previousLetter (char first, char second){
        switch (first) {

            case 'a':
                if (second == 'a'){
                    return 2;
                }
                if (second == 'b'){
                    return 2;
                }
                if (second == 'c'){
                    return 2;
                }
            case 'b':
                if (second == 'a'){
                    return 2;
                }
                if (second == 'b'){
                    return 2;
                }
                if (second == 'c'){
                    return 2;
                }


            case 'c':
                if (second == 'a'){
                    return 2;
                }
                if (second == 'b'){
                    return 2;
                }
                if (second == 'c'){
                    return 2;
                }
            case 'd':
                if (second == 'd'){
                    return 2;
                }
                if (second == 'e'){
                    return 2;
                }
                if (second == 'f'){
                    return 2;
                }
            case 'e':
                if (second == 'd'){
                    return 2;
                }
                if (second == 'e'){
                    return 2;
                }
                if (second == 'f'){
                    return 2;
                }
            case 'f':
                if (second == 'd'){
                    return 2;
                }
                if (second == 'e'){
                    return 2;
                }
                if (second == 'f'){
                    return 2;
                }
            case 'g':
                if (second == 'g'){
                    return 2;
                }
                if (second == 'h'){
                    return 2;
                }
                if (second == 'i'){
                    return 2;
                }
            case 'h':
                if (second == 'g'){
                    return 2;
                }
                if (second == 'h'){
                    return 2;
                }
                if (second == 'i'){
                    return 2;
                }
            case 'i':
                if (second == 'g'){
                    return 2;
                }
                if (second == 'h'){
                    return 2;
                }
                if (second == 'i'){
                    return 2;
                }
            case 'j':
                if (second == 'j'){
                    return 2;
                }
                if (second == 'k'){
                    return 2;
                }
                if (second == 'l'){
                    return 2;
                }
            case 'k':
                if (second == 'j'){
                    return 2;
                }
                if (second == 'k'){
                    return 2;
                }
                if (second == 'l'){
                    return 2;
                }
            case 'l':
                if (second == 'j'){
                    return 2;
                }
                if (second == 'k'){
                    return 2;
                }
                if (second == 'l'){
                    return 2;
                }
            case 'm':
                if (second == 'm'){
                    return 2;
                }
                if (second == 'n'){
                    return 2;
                }
                if (second == 'o'){
                    return 2;
                }
            case 'n':
                if (second == 'm'){
                    return 2;
                }
                if (second == 'n'){
                    return 2;
                }
                if (second == 'o'){
                    return 2;
                }
            case 'o':
                if (second == 'm'){
                    return 2;
                }
                if (second == 'n'){
                    return 2;
                }
                if (second == 'o'){
                    return 2;
                }
            case 'p':
                if (second == 'p'){
                    return 2;
                }
                if (second == 'q'){
                    return 2;
                }
                if (second == 'r'){
                    return 2;
                }
                if (second == 's'){
                    return 2;
                }
            case 'q':
                if (second == 'p'){
                    return 2;
                }
                if (second == 'q'){
                    return 2;
                }
                if (second == 'r'){
                    return 2;
                }
                if (second == 's'){
                    return 2;
                }
            case 'r':
                if (second == 'p'){
                    return 2;
                }
                if (second == 'q'){
                    return 2;
                }
                if (second == 'r'){
                    return 2;
                }
                if (second == 's'){
                    return 2;
                }
            case 's':
                if (second == 'p'){
                    return 2;
                }
                if (second == 'q'){
                    return 2;
                }
                if (second == 'r'){
                    return 2;
                }
                if (second == 's'){
                    return 2;
                }
            case 't':
                if (second == 't'){
                    return 2;
                }
                if (second == 'u'){
                    return 2;
                }
                if (second == 'v'){
                    return 2;
                }
            case 'u':
                if (second == 't'){
                    return 2;
                }
                if (second == 'u'){
                    return 2;
                }
                if (second == 'v'){
                    return 2;
                }
            case 'v':
                if (second == 't'){
                    return 2;
                }
                if (second == 'u'){
                    return 2;
                }
                if (second == 'v'){
                    return 2;
                }
            case 'w':
                if (second == 'w'){
                    return 2;
                }
                if (second == 'x'){
                    return 2;
                }
                if (second == 'y'){
                    return 2;
                }
                if (second == 'z'){
                    return 2;
                }
            case 'x':
                if (second == 'w'){
                    return 2;
                }
                if (second == 'x'){
                    return 2;
                }
                if (second == 'y'){
                    return 2;
                }
                if (second == 'z'){
                    return 2;
                }
            case 'y':
                if (second == 'w'){
                    return 2;
                }
                if (second == 'x'){
                    return 2;
                }
                if (second == 'y'){
                    return 2;
                }
                if (second == 'z'){
                    return 2;
                }
            case 'z':
                if (second == 'w'){
                    return 2;
                }
                if (second == 'x'){
                    return 2;
                }
                if (second == 'y'){
                    return 2;
                }
                if (second == 'z'){
                    return 2;
                }
        }
        return 0;
    }
}