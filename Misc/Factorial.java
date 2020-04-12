public class Factorial {
    public static void main (String[] args){
        System.out.println(factorialRecursion(5));


    }

    private static int factorialRecursion(int num){
        if(num > 1){
            return num*factorialRecursion(num-1);
        } else {
            return 1;
        }
    }
}
