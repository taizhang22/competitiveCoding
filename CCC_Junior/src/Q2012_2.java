public class Q2012_2 {
    public static void main(String[] args) {
        int arr[] = {7,8,8,7};
        int i = 0;
        if((arr[i] > arr[i+1]) && (arr[i+1] > arr[i+2]) && (arr[i+2] > arr[i+3])){
            System.out.println("Fish Diving");
        } else {
            if((arr[i] < arr[i+1]) && (arr[i+1] < arr[i+2]) && (arr[i+2] < arr[i+3])){
                System.out.println("Fish Rising");
            } else {
                if((arr[i] == arr[i+1]) && (arr[i+1] == arr[i+2]) && (arr[i+2] == arr[i+3])){
                    System.out.println("Fish at Constant Depth");
                } else {
                    System.out.println("No Fish");
                }
            }
        }


    }
}



