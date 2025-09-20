import java.util.Random;
import java.util.Scanner;

class myPersonalTest {
    public static void main(String[] args) {
    //Section A
        // 1. Write a Java program to print “Hello, Java World!”.
        /*
        System.out.println("Hello, Java World!");
         */


        // 2. Take two integers as input and print their sum.
        /*
        int a = 4;
        int b = 5;
        int sum = a+b;
        System.out.println(sum);
         */


        // 3. Write a Java program to check whether a number is positive, negative, or zero.
        /*
        int x = 5;
        if (x == 0){
            System.out.println("The given number is Zero.");
        } else if (x<0) {
            System.out.println("The given number is Negative.");
        }else {
            System.out.println("The given number is Positive");
        }
         */


        // 4. Write a Java program to check if a number is even or odd.
        /*
        int x = 5;
        if (x%2 == 0){
            System.out.println("The given number is even.");
        }else {
            System.out.println("The given number is odd.");
        }
         */


        // 5. Write a program to display the multiplication table of 5.
        /*
        int n = 5;
        for (int i = 1; i<= 10; i++){
            System.out.println(n +" x "+i+" = "+n*i);
        }
         */


    //Section B
        // 6. Write a Java program to input a number and print the sum of its digits.
            /*
                Scanner sc = new Scanner(System.in);

                // Input number
                System.out.print("Enter a number: ");
                int number = sc.nextInt();

                int sum = 0;

                // Loop to extract digits
                while (number > 0) {
                    int digit = number % 10;  // Get last digit
                    sum = sum + digit;        // Add digit to sum
                    number = number / 10;     // Remove last digit
                }

                // Output result
                System.out.println("Sum of digits = " + sum);

            */


        // 7. Write a program to find the largest among three numbers entered by the user.
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter third number: ");
        int c = input.nextInt();

        if (a >= b && a >= c) {
            System.out.println(a + " is the largest number.");
        } else if (b >= a && b >= c) {
            System.out.println(b + " is the largest number.");
        } else {
            System.out.println(c + " is the largest number.");
        }

         */

        // 8. Write a Java program to calculate the factorial of a number using a loop.
        /*
        int n = 5;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " = " + fact);
         */

        // 9. Write a program to print the first 10 terms of the Fibonacci series.
        /*
        int x = 0, n = 1,sum = 0;
        for (int i = 0; i<10; i++){
            System.out.println(x +" + "+ n + " = " + sum);
            sum = x + n;
            x = n;
            n = sum;
        }
         */


        // 10. Write a Java program to reverse a number (e.g., input: 123, output: 321).
        /*
        int num = 1234, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number = " + reversed);
         */


        //Section C
        // 11. Write a program to check if a given number is a prime number.
        /*
        int num = 29;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a Prime number.");
        } else {
            System.out.println(num + " is NOT a Prime number.");
        }
         */



        // 12. Write a Java program to check if a number is a palindrome.
        /*
        int num = 121, original = num, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }
         */


        // 13. Write a program to find the greatest common divisor (GCD) of two numbers.
        /*
        int a = 54, b = 24;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD = " + a);
         */

        // 14. Write a program to check if a number is an Armstrong number.
        /*
        int num = 153, sum = 0, temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is NOT an Armstrong number.");
        }
        */

        // 15. Write a program to print the following pattern for n = 5:
        /*1
          12
          123
          1234
          12345
         */
        /*
        int n = 5;
        for (int i = 1; i <= n; i++) {;
            for(int j = 1 ; j <= i; j++){
                System.out.print(j);;
            }
            System.out.println();

        }
         */

    //Section D
        // 16. Write a Java program to implement a basic calculator using switch-case (supports +, -, *, /).
        /*
        int val1, val2, operator;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first value: ");
        val1 = scan.nextInt();
        System.out.println("Enter the Second value: ");
        val2 = scan.nextInt();
        System.out.println();
        System.out.println("****Operation Option****");
        System.out.println("Enter 1 for the addition.");
        System.out.println("Enter 2 for the subtraction.");
        System.out.println("Enter 3 for the multiplication.");
        System.out.println("Enter 4 for the division.");
        System.out.println("Choose the operation by entering appropriate number: ");
        operator = scan.nextInt();

        switch (operator){
            case 1:
                System.out.println("The addition of " +val1+ " and " +val2+ " is : " +(val1+val2));
                break;
            case 2:
                System.out.println("The subtraction of " + val1 + " and " + val2 + " is : " + (val1-val2));
                break;
            case 3:
                System.out.println("The multiplication of " +val1+ " and " +val2+ " is : " +(val1*val2));
                break;
            case 4:
                System.out.println("The division of " +val1+ " and " +val2+ " is : " +(val1/val2));
                break;
            default:
                System.out.println("You did something wrong!!! PLease try again...");
        }
         */

        // 17. Write a program to print the following diamond pattern for n = 5:
        /*
           *
          ***
         *****
          ***
           *
         */
        /*
        int n = 5;
// upper half
        for (int i = 1; i <= n; i += 2) {
            for (int j = n; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
// lower half
        for (int i = n - 2; i >= 1; i -= 2) {
            for (int j = n; j > i; j -= 2) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */


        // 18. Write a Java program to generate a random number between 1 and 100 and let the user guess it. Print “too high,” “too low,” or “correct.”
        // I am glad that I knew Random library.
        /*
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int number = rand.nextInt(100) + 1;
        int guess = 0;

        while (guess != number) {
            System.out.print("Enter your guess (1-100): ");
            guess = sc.nextInt();

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! The number was " + number);
            }
        }
         */


        // 19. Write a program to check if a number is a strong number (sum of factorial of digits = number).
        /*
        int num = 145, sum = 0, temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is NOT a Strong number.");
        }
        */

        // 20. Write a Java program that prints all prime numbers between 1 and 100.
        /*
        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        */
    }
}
