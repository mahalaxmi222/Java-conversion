public class IntToShortExample {
    public static void main(String[] args) {
        // Narrowing conversion from int to short
        int intValue = 1000;
        short shortValue = (short) intValue; // Explicit narrowing conversion

        // Displaying values before and after conversion
        System.out.println("Original int value: " + intValue);
        System.out.println("Narrowed short value: " + shortValue);
    }
}
