public class Q2009_2 {

    public static void main(String[] args) {

        int troutPoints = 1;
        int pikePoints = 1;
        int pickerelPoints = 1;
        int totalPointsAllowed = 1000;

        int maxTrouts = totalPointsAllowed/troutPoints;
        int maxPikes = totalPointsAllowed/pikePoints;
        int maxPickerels = totalPointsAllowed/pickerelPoints;

        int count = 0;
        for (int i = 0; i <= maxTrouts; i++){
            for(int j = 0; j <= maxPikes; j++){
                for (int k = 0; k <= maxPickerels; k++){
                    if ((i*troutPoints + j*pikePoints + k*pickerelPoints <= totalPointsAllowed)
                            && (i+j+k>=1)) {
                        count++;
                        System.out.println(i + " Brown Trout, " + j + " Northern Pike, " + k + " YellowPickerel");
                    }
                }
            }
        }
        System.out.println("Number of ways to catch fish: " + count);
    }
}