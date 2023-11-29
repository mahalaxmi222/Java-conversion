public class DoubleToIntExample {
    public static void main(String[] args) {
        // Narrowing conversion from double to int
        double doubleValue = 42.56;
        int intValue = (int) doubleValue; // Explicit narrowing conversion

        // Displaying values before and after conversion
        System.out.println("Original double value: " + doubleValue);
        System.out.println("Narrowed int value: " + intValue);
    }
}
