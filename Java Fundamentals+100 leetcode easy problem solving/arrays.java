//import java.util.Arrays;

import java.util.Arrays;

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
        //String[] expensiveCars = {"volvo", "BMW", "Ford", "RR"};
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


//        // An array storing different ages
//        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
//
//        float avg, sum = 0;
//
//        // Get the length of the array
//        int length = ages.length;
//
//        // Loop through the elements of the array
//        for (int age : ages) {
//            sum += age;
//        }
//
//        // Calculate the average by dividing the sum by the length
//        avg = sum / length;
//
//        // Print the average
//        System.out.println("The average age is: " + avg);
//        // Pre-define Array size
//                int[] numbers = new int[5];
//
//                numbers[0] = 28;
//                numbers[1] = 43;
//                numbers[2] = 13;
//                numbers[3] = 23;
//                numbers[4] = 33;
//
//                // Print the array values
//                for (int num : numbers) {
//                    System.out.print(num + " ");
//                }



        // Multidimensional Array
//        int [][] myNumber = {{1,2,3} , {4,5,6}};
//        /*
//             Column 0 1 2
//                    | | |
//           Row 0 -- 1 2 3
//           Row 1 -- 4 5 6
//         */
//        System.out.println(myNumber[1][2]); // it will give the Row 1's 2nd column value = 6
//        myNumber [1][2] = 4;                // it will change the value of 1st row's 2nd column value
//        System.out.println(myNumber[1][2]); // it will give the Row 1's 2nd column value = 4
//
//        System.out.println("Row: " + myNumber.length);
//        System.out.println("Columns in row: " + myNumber[0].length);
//        System.out.println("Columns in row: " + myNumber[1].length);

        int [][] myNumber = {{1,4,2},{3,6,8,5,2}};
        for (int row = 0; row < myNumber.length; row++){
            for(int colm = 0; colm < myNumber[row].length; colm++){
                System.out.print("[" + myNumber[row][colm] +"]"  );
            }
            System.out.println();
        }

    }
}
