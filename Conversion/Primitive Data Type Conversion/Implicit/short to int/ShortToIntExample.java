public class ShortToIntExample {
    public static void main(String[] args) {
        // Widening conversion from short to int
        short shortValue = 123;
        int intValue = shortValue; // Implicit widening conversion

        // Displaying values before and after conversion
        System.out.println("Original short value: " + shortValue);
        System.out.println("Widened int value: " + intValue);
    }
}
