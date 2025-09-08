import java.io.*;

public class Variables {
    //Local Variable
    /*public static void main(String[] args)
    {
        // x is a local variable
        int x = 10;

        // message is also a local variable
        String message = "Hello, world!";

        System.out.println("x = " + x);
        System.out.println("message = " + message);

        if (x > 5) {
            // the result is a local variable
            String result = "x is greater than 5";
            System.out.println(result);
        }

        // Uncommenting the line below will result in a compile-time error System.out.println(result);
        for (int i = 0; i < 3; i++) {
            String loopMessage
                    = "Iteration " + i; // loopMessage is a local variable
            System.out.println(loopMessage);
        }

        // Uncommenting the line below will result in a
        // compile-time error
        // System.out.println(loopMessage);
    }*/


    //Instance Variable

    /*public String variables;
    public int i;
    public Integer I;
    public Variables(){
        //Default Constructor initializing Variable
        this.variables = "Karan Vaghela";
    }

    public static void main(String[] args) {
        // New object creation
        Variables name = new Variables();

        // Displaying output
        System.out.println("Variable name is: " + name.variables);
        System.out.println("Default value of int is : " + name.i);

        //toString() called internally
        System.out.println("Default value for integer is: " + name.I);
    }*/

    //Static Variable
    public static String variable = "Karan Vaghela";

    public static void main(String [] args){

        // Karan Vaghela message can be accessed without any object creation diplaying output Variables.variable --> using the static variable
        System.out.println("variable name is: " + Variables.variable);
        // static int c = 0;
        // the above line, when uncommented, will throw an error as static variables cannot be declared locally.
    }
}