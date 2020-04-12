import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S12017 {

    public static void main (String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int days = Integer.parseInt(br.readLine());

        String[] Sw = br.readLine().split(" ");
        String[] Se = br.readLine().split(" ");

        int swift[] = new int[days];

        int sema[] = new int[days];

        int swift1 = 0;

        int sema1 = 0;

        int oof = 0;

        for(int i = 0; i < days; i++){
            swift[i] = Integer.parseInt(Sw[i]);

            sema[i] = Integer.parseInt(Se[i]);
        }

        for (int i = 0; i < days; i++){
            swift1 += swift[i];
            sema1 += sema[i];

            if (swift1 == sema1){
                oof = i+1;
            }
        }
        if (oof == 0){
            System.out.println(0);
        } else {
            System.out.println(oof);
        }


    }


}
