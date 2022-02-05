public class Main {
    // public static void main(String[] args) {
    // // int[] myNumbers = { 1, 2, 3 };
    // // System.out.println(myNumbers[10]);
    // try {
    // int[] myNumbers = { 1, 2, 3 };
    // System.out.println(myNumbers[10]);
    // } catch (Exception exception) {
    // System.out.println("no number in 10 of the array, Error from exception");
    // } finally {
    // System.out.println("The 'try catch' is finished.");
    // }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
            // System.out.println("Hellooo");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {

        try {

            checkAge(15); // Set age to 15 (which is below 18...)
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

}
