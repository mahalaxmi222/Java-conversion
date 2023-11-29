public class IntToLongExample {
    public static void main(String[] args) {
        // Widening conversion from int to long
        int intValue = 42;
        long longValue = intValue; // Implicit widening conversion

        // Displaying values before and after conversion
        System.out.println("Original int value: " + intValue);
        System.out.println("Widened long value: " + longValue);
    }
}
