import java.util.ArrayList;
import java.util.Scanner;
public class S32013 {

    static Scanner scan = new Scanner(System.in);
    static int favTeam;
    static ArrayList<Game> gamesNeeded;
    static int count;
    static int gamesDone;
    static int scores[];

    public static void main (String[] args) {

        gamesNeeded = new ArrayList<Game>();

        //this for loop initiates the gamesNeeded with all 6 games that have to be played.
        for(int x = 0; x < 4; x++){
            for(int y = x +1; y < 4; y++){

                gamesNeeded.add(new Game(x,y));
            }
        }


        //receive the variables and tally initial scores.
        favTeam = scan.nextInt();
        gamesDone = scan.nextInt();
        scores = new int[4];

        for(int i = 0; i < gamesDone; i++){
            int new1 = scan.nextInt() - 1;
            int new2 = scan.nextInt() - 1;
            int score1 = scan.nextInt();
            int score2 = scan.nextInt();

            if(score1 > score2){
                scores[new1] += 3;
            } else if(score2 > score1){
                scores[new2] += 3;
            } else {
                scores[new1]++;
                scores[new2]++;
            }
            gamesNeeded.remove(gamesNeeded.indexOf(new Game(new1,new2)));
        }













    }






    static class Game {
        int t1;
        int t2;

        Game(int team1, int team2) {
            this.t1 = t1;
            this.t2 = t2;
        }


        @Override
        public boolean equals(Object o) {
            if (o instanceof Game) {
                Game g = (Game) o;
                return (t1 == g.t1) && (t2 == g.t2);
            }
            return false;
        }

    }
}
