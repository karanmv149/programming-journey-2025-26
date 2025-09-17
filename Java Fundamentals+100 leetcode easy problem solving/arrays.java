//import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // with new
//        String [] cars = new String[4];
//        cars [0] = "element 1";
//        cars [1] = "element 2";
//        cars [2] = "element 3";
//        cars [3] = "element 4";
//        System.out.println(cars[1]);

        // access through Loop
        String[] expensiveCars = {"volvo", "BMW", "Ford", "RR"};
        // Step 1 to print an array
//        for (int i = 0; i < expensiveCars.length; i++) {
//            System.out.println(expensiveCars[i]);
//
//        }
        //for this you have to import java.util.Arrays
//        System.out.println(Arrays.toString(expensiveCars));

        // For Loop easy method
//        for (String Cars: expensiveCars){
//            System.out.print(Cars + " ");
//        }


        int [] age = {20, 22, 18, 35, 48, 26, 87, 70};
        float avg, sum = 0;
        int length = age.length;

        for(int ages : age ){
            sum += ages;
        }
        System.out.println( sum / length);

    }
}
