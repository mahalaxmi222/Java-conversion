public class ShortToStringExample {
    public static void main(String[] args) {
        // short to String conversion
        short shortValue = 42;

        // Using Short.toString()
        String strValue = Short.toString(shortValue);

        // Alternatively, using String.valueOf()
        // String strValue = String.valueOf(shortValue);

        System.out.println("Original short value: " + shortValue);
        System.out.println("Converted String value: " + strValue);
    }
}
