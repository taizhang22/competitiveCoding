import java.util.Scanner;
import java.util.Stack;
public class S32014 {

    public static void main (String args[]){

        Scanner scan = new Scanner(System.in);

        int total = scan.nextInt();

        for (int i = total;i > 0; i--) {
            int size = scan.nextInt();

            Stack<Integer> top = new Stack<Integer>();
            Stack<Integer> branch = new Stack<Integer>();
            top.push(0);
            branch.push(0);
            int counter = 1;
            for (int y = 0; y < size; y++) {
                top.push(scan.nextInt());
            }

            boolean remind = true; //is this needed.

            while (counter <= size){
                if (top.peek() == counter){
                    top.pop();
                    counter++;
                } else if (branch.peek() == counter) {
                    branch.pop();
                    counter++;
                } else {
                    if (top.peek() == 0){
                        remind = false;
                        break;
                    }
                    branch.push(top.pop());
                }
            }
            System.out.println(remind ? "Y" : "N");


    }



    }
}
