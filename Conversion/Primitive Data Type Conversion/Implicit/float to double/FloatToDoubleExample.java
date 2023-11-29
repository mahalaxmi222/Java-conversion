public class FloatToDoubleExample {
    public static void main(String[] args) {
        // Widening conversion from float to double
        float floatValue = 3.14f;
        double doubleValue = floatValue; // Implicit widening conversion

        // Displaying values before and after conversion
        System.out.println("Original float value: " + floatValue);
        System.out.println("Widened double value: " + doubleValue);
    }
}
