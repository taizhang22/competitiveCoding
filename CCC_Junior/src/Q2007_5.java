public class Q2007_5 {
    public static int ways = 0;

    public static int findPath(int currentDistance,int mina, int maxb, int[] motel, int ways){
        if (currentDistance+maxb >= 7000){
        ways += 1;
            return ways;
    } else {
        for (int i = 0; i < 12; i++){
            if (motel[i] >= currentDistance+mina && motel[i] <= currentDistance + maxb){
                ways = findPath(motel[i], mina, maxb, motel, ways);
            }
        }
        return ways;
    }
}



    public static void main(String[] args){

        int[] motel = {0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000};
        int mina = 970;
        int maxb = 1040;
        int result = findPath(0,mina,maxb,motel,0);
        System.out.println("\n" + result);












    }
}
