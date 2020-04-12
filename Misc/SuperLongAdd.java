import java.util.*;
public class SuperLongAdd {

    public static ArrayList<Integer> addTOFirst(ArrayList<Integer> A,ArrayList<Integer> B) {

        ArrayList<Integer> rL=new ArrayList<Integer>();
        int tmp = 0;
        int sum = 0;
        int lenA = A.size();
        int lenB = B.size();
        int loop = 0;
        int loop1 = 0;
        if (lenA >= lenB)
        {
            loop = lenB;
            loop1 = lenA - lenB;
        }
        else
        {
            loop = lenA;
            loop1 = lenB - lenA;
        }

        for(int i = 0; i < loop; i++)
        {
            sum = A.get(lenA - 1 - i) + B.get(lenB - 1 - i) + tmp;

            rL.add(0,sum%10);
            tmp = sum / 10;
        }

        for(int i = 0; i < loop1; i++)
        {
            if(lenA > lenB)
                sum = A.get(loop1 - 1 - i) + tmp;
            else
                sum = B.get(loop1 - 1 - i) + tmp;
            rL.add(0,sum%10);
            tmp = sum / 10;
        }
        return rL;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> aL=new ArrayList<Integer>();//Creating arraylist
        ArrayList<Integer> bL=new ArrayList<Integer>();//Creating arraylist
        ArrayList<Integer> result;

        System.out.println("Please input first number:");
        String t = input.nextLine();
        for(int i = 0; i < t.length(); i++)
            aL.add((int)(t.charAt(i)-'0'));

        System.out.println("Please input second number:");
        t = input.nextLine();
        for(int i = 0; i < t.length(); i++)
            bL.add((int)(t.charAt(i)-'0'));
        result=addTOFirst(aL,bL);

        System.out.println("The result is:");
        for(int i = 0;i < result.size(); i++)
            System.out.print(result.get(i));
        System.out.println();
        input.close();
    }

}
