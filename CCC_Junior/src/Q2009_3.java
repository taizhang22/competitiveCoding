public class Q2009_3 {

    public static void main(String[] args) {

        int ottawatime = 2359;
        int newfoundlandtime = ottawatime + 130;
        int atlantictime = ottawatime + 100;
        int centraltime = ottawatime - 100;
        int replacedcentral = 0;
        int mountaintime = ottawatime - 200;
        int replacedmountain = 0;
        int pacifictime = ottawatime - 300;
        int replacedpacific = 0;


        if (centraltime < 0){
            replacedcentral = 2400 + centraltime;
        }
        if (mountaintime < 0){
            replacedmountain = 2400 + mountaintime;
        }

        if (pacifictime < 0){
            replacedpacific = 2400 + pacifictime;
        }

        System.out.println(ottawatime + " in Ottawa");

        if (pacifictime > replacedpacific){
            System.out.println(pacifictime + " in Victoria");
        } else {
            System.out.println(replacedpacific + " in Victoria");
        }


        if (mountaintime > replacedmountain){
            System.out.println(mountaintime + " in Edmonton");
        } else {
            System.out.println(replacedmountain + " in Edmonton");
        }

        if (centraltime > replacedcentral){
            System.out.println(centraltime + " in Winnipeg");
        } else {
            System.out.println(replacedcentral + " in Winnipeg");
        }

        System.out.println(ottawatime + " in Toronto");
        System.out.println(atlantictime + " in Halifax");


        System.out.println(newfoundlandtime + " in St. John's");

        int whatthehell = newfoundlandtime - ottawatime;

        System.out.println(whatthehell);





    }
}