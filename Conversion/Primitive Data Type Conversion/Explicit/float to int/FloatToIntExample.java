public class FloatToIntExample {
    public static void main(String[] args) {
        // Narrowing conversion from float to int
        float floatValue = 3.14f;
        int intValue = (int) floatValue; // Explicit narrowing conversion

        // Displaying values before and after conversion
        System.out.println("Original float value: " + floatValue);
        System.out.println("Narrowed int value: " + intValue);
    }
}
