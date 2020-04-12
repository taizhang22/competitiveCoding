public class Q2011_2 {

    public static int firstLanding(int humidity, int length){

        int firstLandTime = -1;
        for(int i = 1; i < length; i++){
            double altitude = 0;
            altitude = (-6*Math.pow(i,4)) + (humidity*Math.pow(i,3)) + (2*Math.pow(i,2)) + i;

            if(altitude <= 0){
                return i;
            }

        }

        return firstLandTime;
    }

    public static void main(String[] args) {
            int h = 1;
            int M = 239;

        System.out.println(firstLanding(h,M));


    }
}
