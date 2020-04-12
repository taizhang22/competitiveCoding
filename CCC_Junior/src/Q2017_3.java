public class Q2017_3 {

    public static void main(String[] args) {

        int beginningX = 1;
        int beginningY = 1;
        int endX = 0;
        int endY = 0;
        int charge = 2;
        String electricalCharge;

        int theRoute = Math.abs(beginningY-endY) + Math.abs(beginningX-endX);
        if ((theRoute-charge) % 2 == 0){
            System.out.println("y");
        } else {
        } System.out.println("f");
    }
}
