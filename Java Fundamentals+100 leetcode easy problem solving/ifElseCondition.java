class ifElseCondition {
    public static void main(String[] args) {
        boolean isRunning = true;
        if (isRunning){
            System.out.println("Yes, she is running.");
        }else {
            System.out.println("No, she is not running.");
        }


        // Shorthand if-else
        int age = 18;
        String adult = ( age >= 18 ) ? "Yes, you are an adult " : "You are not an adult";
        System.out.println(adult);
    }
}
