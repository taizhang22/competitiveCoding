import java.util.Scanner;
import java.io.*;
import java.util.*;

public class HR_Balanced_Brackets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String check = "{[()]}";

        System.out.println(isBalanced(check));

    }

    static String isBalanced(String s){
        if(s.substring(0,1).equals ("{")){
            if(counterPart1(s.substring(1))){
                return "YES";
            }
        }

        if(s.substring(0,1).equals ("(")){
            if(counterPart2(s.substring(1))){
                return "YES";
            }
        }

        if(s.substring(0,1).equals ("[")){
            if(counterPart3(s.substring(1))){
                return "YES";
            }
        }

        return "NO";
    }

    static boolean counterPart1(String s) {
        System.out.println("Called 1");
        if (s.substring(0, 1).equals("}")) {
            return true;
        } else {
            switch (s.substring(0, 1)) {
                case "{":
                    counterPart1(s.substring(1));
                    break;
                case "(":
                    counterPart2(s.substring(1));
                    break;
                case "[":
                    counterPart3(s.substring(1));
                    break;

            }
        }
        return false;
    }

    static boolean counterPart2(String s){
        System.out.println("Called 2");
        if (s.substring(0, 1).equals(")")) {
            return true;
        } else {
            switch (s.substring(0, 1)) {
                case "{":
                    counterPart1(s.substring(1));
                    break;
                case "(":
                    counterPart2(s.substring(1));
                    break;
                case "[":
                    counterPart3(s.substring(1));
                    break;

            }
        }
        return false;
    }

    static boolean counterPart3(String s){
        System.out.println("Called 3");
        if (s.substring(0, 1).equals("]")) {
            return true;
        } else {
            switch (s.substring(0, 1)) {
                case "{":
                    counterPart1(s.substring(1));
                    break;
                case "(":
                    counterPart2(s.substring(1));
                    break;
                case "[":
                    counterPart3(s.substring(1));
                    break;

            }
        }
        return false;
    }
/*
    static String isBalanced(String s) {
        char[] charlist = s.toCharArray();

        int half = charlist.length;

        if(half%2 == 1){
            System.out.println("not equal");
            return "NO";
        }
        ArrayList<Character> list =  new ArrayList<Character>();

        for(int i = 0; i < (s.length()/2); i++){
            list.add(charlist[i]);
        }

        for(int i = 0; i < half; i++){
            if(list.size() > 0) {
                if (isEqual(list.get(0), charlist[charlist.length - i - 1])) {
                    list.remove(0);
                } else {
                    System.out.println(charlist[charlist.length - i - 1]);
                    System.out.println(list.get(0));
                    return "NO";
                }
            }
        }
        return "YES";
    }

    static boolean isEqual(char a, char b){
        if ((a == '{') && (b == '}')){
            return true;
        }

        if ((a == '[') && (b == ']')){
            return true;
        }

        if ((a == '(') && (b == ')')){
            return true;
        }

        return false;

    }

*/
}
