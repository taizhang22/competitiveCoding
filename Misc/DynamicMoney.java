public class DynamicMoney {

    public static void main(String[] args) {

        int total = 0;



        int[] dynamic = new int[total+12];


        dynamic[0] = 0;
        dynamic[1] = 1;
        dynamic[2] = 2;
        dynamic[3] = 3;
        dynamic[4] = 4;
        dynamic[5] = 1;
        dynamic[6] = 2;
        dynamic[7] = 3;
        dynamic[8] = 4;
        dynamic[9] = 5;
        dynamic[10] = 2;
        dynamic[11] = 1;
        /*
        dynamic[12] = 2;
        dynamic[13] = 3;
        dynamic[14] = 4;
        dynamic[15] = 3;
        dynamic[16] = 2;
        */

        for(int i = 12; i < dynamic.length; i++){

                if(dynamic[i-11] <= dynamic[i-5]){
                    dynamic[i] += dynamic[i-11] + 1;
                    continue;
                }

                if(dynamic[i-5] <= dynamic[i-1]){
                    dynamic[i] += dynamic[i-5] + 1;
                    continue;
                }

                dynamic[i] += dynamic[i-1] + 1;
        }
        System.out.println(dynamic[total]);



    }
}
