import java.math.BigInteger;
import java.util.Scanner;

public class CodingBat_Warmup1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        BigInteger num1;
        BigInteger num2;
        BigInteger sum;
        System.out.println("Enter the value of number 1");
        num1 = sc.nextBigInteger();
        System.out.println("Enter the value of number 2");
        num2 = sc.nextBigInteger();

        BigInteger a = new BigInteger(""+num1);
        BigInteger b = new BigInteger(""+num2);
        BigInteger result = a.add(b);

        System.out.println("Sum is Two numbers : -> " + result);






    }
}

