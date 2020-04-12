public class Q2008_1 {

    public static void main(String[] args) {
        double weight = 90;
        double height = 2.1;
        double height2 = height * height;
        double BMI = weight/height2;

        if (BMI > 25){
            System.out.println("Overweight");
        } else {
            if ((BMI <= 25) && (BMI >= 18.5)){
                System.out.println("Normal weight");
            } else {
                if (BMI < 18.5){
                    System.out.println("Underweight");
                }
            }
        }

        System.out.println(BMI);

    }

}