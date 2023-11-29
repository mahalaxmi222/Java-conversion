public class LongToIntExample {
    public static void main(String[] args) {
        // Narrowing conversion from long to int
        long longValue = 123456789L;
        int intValue = (int) longValue; // Explicit narrowing conversion

        // Displaying values before and after conversion
        System.out.println("Original long value: " + longValue);
        System.out.println("Narrowed int value: " + intValue);
    }
}
