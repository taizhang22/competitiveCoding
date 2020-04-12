public class Q2013_3 {

    public static int nextYear(int startYear){
        int yearAt = startYear + 1;

        while(true) {
            String temp = Integer.toString(yearAt);

            if(temp.charAt(2) == temp.charAt(3)){
                yearAt++;
                continue;
            } else if(temp.charAt(1) == temp.charAt(2) || temp.charAt(1) == temp.charAt(3)){
                yearAt++;
                    continue;
            } else if(temp.charAt(0) == temp.charAt(1) || temp.charAt(0) == temp.charAt(2) || temp.charAt(0) == temp.charAt(3)){
                yearAt++;
                continue;
            }
            return yearAt;
        }
    }


    public static void main(String[] args) {

        int startYear = 3482;
        System.out.println(nextYear(startYear));



    }

}