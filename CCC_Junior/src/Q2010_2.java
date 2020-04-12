public class Q2010_2 {



    public static void main(String[] args) {

        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int s = 10;

        int NikkyRounds = s/(a+b);
        int ByronRounds = s/(c+d);
        int NikkyFinalRoundsSteps = s%(a+b);
        int ByronFinalRoundsSteps = s%(c+d);
        int NikkyForward = NikkyRounds*(a-b) +
                NikkyFinalRoundsSteps <= a? NikkyFinalRoundsSteps:a-(NikkyFinalRoundsSteps-a);
        int ByronForward = ByronRounds*(c-d) +
                ByronFinalRoundsSteps <= c? ByronFinalRoundsSteps:c-(ByronFinalRoundsSteps-c);

        if(NikkyForward > ByronForward)
            System.out.println("Nikky");
        else if(NikkyForward < ByronForward)
            System.out.println("Byron");
        else
            System.out.println("Tied");




        }




    }



