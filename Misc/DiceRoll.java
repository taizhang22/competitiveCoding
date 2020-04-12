public class DiceRoll {
    public static void main(String[] args) {
        System.out.println(roll(6,3));
    }

    public static String roll(int sides, int num){
        int total = 0;
        String send = "Rolled: ";

        if((sides <= 10000) && (num <= 20)){
            for(int i = 0; i < num; i++){
                int rolled = (int)(Math.random() * sides) + 1;
                send = send.concat(String.valueOf("|" + rolled + "| "));
                total += rolled;
            }
            send = send.concat("Total: " + total);

            return send;
        } else {
            return "That's a bit too much.";
        }
    }


}
