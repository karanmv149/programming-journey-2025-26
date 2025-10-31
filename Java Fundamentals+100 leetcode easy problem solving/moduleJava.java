public class moduleJava {

    //method create and call
    /*
    static void myMethod(){
        System.out.println("I just got executed!");
    }

    public static void main(String[] args){
        myMethod();
    }
     */

    //method with pre-defined parameters
    /*
    static void myMethod(String fname, int age){
        System.out.println("\"" +fname + "\" name is executed, And he is " + age + " year old.");
    }

    public static void main(String[] args){
        myMethod("Karan" , 20);
        myMethod("Rohan", 19);
        myMethod("Sahil", 18);
    }
     */

    //methods with return values v
    /*
    static int myMethod(int x){ //will use int instead of void because void doesn't return any value
        return 5 + x;
    }

    public static void main(String[] args){
        System.out.println(myMethod(5));
    }
     */

    // Method Overlaoding - multiple methods can have the same name with different parameters
    /*static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethoDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethoDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }*/

    static int plusMethod (int x, int y){
        return x+y;
    }

    /*static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5);
        double myNum2 = plusMethod(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);

    }*/

    // Recursion (technique of making a function call itself. This technique provides a way to break complicated
    // problems down into simpler problems which are easier to solve
    //Example: adding a range of numbers from 1 to 10.

    /*public static int sum (int k){
        if (k > 0) {
            return k + sum(k-1);
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }*/
}
