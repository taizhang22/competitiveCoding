public class Recursion{


    static int n1=0,n2=1,n3=0;

    static void Fib(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            Fib(count-1);
        } else {
            System.out.println(n1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n==1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }






    public static void main(String[] args) {

        int count = 50;
        Fib(count);
        System.out.println(fibonacci(100));
    }



}


