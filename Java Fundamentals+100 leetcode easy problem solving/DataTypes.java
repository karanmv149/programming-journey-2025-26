class DataTypes {
    public static void main(String[] args) {


        short myShortNum = 5000;    // Short can store whole numbers from -32768 to 32767
        int myIntNum = 500000;      // Integer (Whole number) & it can store -247483648 to 2147483647
        long myLongNum = 15000000L; // Long can store whole numbers from -9223372036854775808 to 9223372036854775807

        float myFloatNum = 5.99f;   // Floating point number
        char MyLetter = 'K';        // Character
        boolean myBool = true;      // Boolean
        String myText = "Hello";    // String


        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';
        String costFormula = "This is calculated by Items * Cost Per Item.";

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("cost per item: " + costPerItem + currency);
        System.out.println(costFormula);
        System.out.println("Total Cost = " + totalCost + currency);
    }
}
