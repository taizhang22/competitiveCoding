import java.util.Scanner;

public class S32015 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int numgates = scan.nextInt();

        int numplanes = scan.nextInt();

        int counter = 0;

        int oof = 0;

        int planes[] = new int[numplanes];

        int gate[] = new int[numgates + 1];

        for (int i = 0; i < numplanes; i++){
            planes[i] = scan.nextInt();
        }


        for(int q = 0; q < numplanes; q++){

            if (gate[planes[q]] == 0){
                counter++;
                gate[planes[q]] = 1;
                //System.out.println("Plane " + (q + 1)+ " " + planes[q] +" fit into gate " + planes[q] + " initially");
            } else {
                oof = planes[q] - 1;
                //System.out.println(oof);
                while (oof > 0){

                    if(gate[oof] == 0){
                        counter++;
                        gate[oof] = 1;
                        //System.out.println("Plane " + (q + 1)+ " " + planes[q] +" fit into gate " + (oof));
                        break;
                    } else {
                        oof--;
                        //System.out.println("Plane " + (q+1) + " " + planes[q] +" couldn't fit into gate " + (oof + 1));
                    }

                }
                if (oof == 0){
                    break;
                }

            }


        }

        System.out.println(counter);

    }


}
