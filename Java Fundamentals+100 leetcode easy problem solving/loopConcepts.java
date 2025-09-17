class loopConcepts {
    public static void main(String[] args){
        // While loop
        /*
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
         */
        /*
        int countdown = 3;
        while(countdown > 0){
            System.out.println(countdown);
            countdown--;
        }
        System.out.println("Happy New Year!!!");
         */


        // Do / While Loop
        /*
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i<5);
         */


        // For Loop
        /*
        int sum = 0;
        for ( int i = 1; i <= 5; i++){
            sum = sum + i;
        }
        System.out.println("Sum is " + sum);
         */

        // Nested Loops
        /*
        // Outer loop
        for (int i = 1; i <= 2; i++){
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++){
                System.out.println("Inner: " + j); // Executes 6 times (2*3)
            }
        }
         */

        /*
        for (int i = 1; i <= 3; i++) {
            for( int j = 1; j <= 3; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
         */
        /*
        String [] cars = {"volvo", "BMW", "Ford", "Mazda"};

        for (String car: cars){
            System.out.print(car+" ");
        }
         */

/*
        //Count to 100 by 10
        for (int i = 0; i <= 100; i = i+10){
            System.out.println(i);
        }
        //Count only even number from 0 to 10
        for (int i = 0; i <= 10; i+=2){
            System.out.println(i);
        }
 */


        // Break statement
//        for (int i = 0; i <= 10; i++) {
//            if( i == 4){
//                break;
//            }
//            System.out.println(i);
//        }

        // Break statement
        for (int i = 0; i <= 10; i++) {
            if( i == 4){
                continue;
            }
            System.out.println(i);
        }

    }
}
